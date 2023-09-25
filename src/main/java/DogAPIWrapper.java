import java.io.IOException;

public class DogAPIWrapper {

    private static final String API_URL = "https://apis.thatapicompany.com/geo-ip-api-community/locations/iplookup?ip=";
    public static String apiKey;

    public DogAPIWrapper(String apiKey) {
        DogAPIWrapper.apiKey = apiKey;
    }

    /**
     * Returns url
     */
    public String getDog() {
        try {
            return RandomDogImageFetcher.getRandomdogImage().getUrl();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
