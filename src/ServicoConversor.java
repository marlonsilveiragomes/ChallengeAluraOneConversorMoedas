import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoConversor {
    private static final String API_KEY = "20f34e74dac2d2783047aecf";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public void converter(String from, String to, double valor) {
        try {
            double taxa = buscarTaxaDeCambio(from, to);
            if (taxa == 0) {
                System.out.println("Erro ao buscar a taxa de câmbio.");
                return;
            }

            double valorConvertido = valor * taxa;
            System.out.printf("Taxa de câmbio de %s para %s: %.4f%n", from, to, taxa);
            System.out.printf("Valor convertido: %.2f %s%n", valorConvertido, to);

        } catch (Exception e) {
            System.out.println("Erro durante a conversão: " + e.getMessage());
        }
    }

    private double buscarTaxaDeCambio(String from, String to) throws Exception {
        String url = API_URL + from;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();

        Gson gson = new Gson();
        JsonObject jsonResponse = gson.fromJson(responseBody, JsonObject.class);

        if (!jsonResponse.get("result").getAsString().equals("success")) {
            System.out.println("Erro ao obter taxas de câmbio. Verifique sua API Key ou tente novamente mais tarde.");
            return 0;
        }

        JsonObject rates = jsonResponse.getAsJsonObject("conversion_rates");
        return rates.get(to).getAsDouble();
    }
}
