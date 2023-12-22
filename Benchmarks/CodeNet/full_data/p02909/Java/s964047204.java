import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input = br.readLine();
            List<String> weathers = Arrays.asList("Sunny", "Cloudy", "Rainy");
            Map<String, Integer> weatherPrediction = new HashMap<>();
            weatherPrediction.put("Sunny", 1);
            weatherPrediction.put("Cloudy", 2);
            weatherPrediction.put("Rainy", 0);

            
            System.out.println(weathers.get(weatherPrediction.get(input).intValue()));
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}