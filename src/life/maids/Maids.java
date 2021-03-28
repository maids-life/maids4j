package life.maids;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.json.JSONObject;

import life.maids.internal.EndPoints;

public class Maids {

	public static String getRandomImage(EndPoints endpoint) throws IOException, InterruptedException {
		
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endpoint.getEndpoint()))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		return format(response.body());	
	}
	
	private static String format(String json) {
		JSONObject object = new JSONObject(json);
		return String.valueOf(object.get("link"));
	}
	
}