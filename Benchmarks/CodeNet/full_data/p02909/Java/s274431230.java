import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String S = br.readLine();
	String[] weatherList = { "Sunny", "Cloudy", "Rainy" };
	int predict = 0;
	if (S.equals(weatherList[0]))
	    predict = 1;
	else if (S.equals(weatherList[1]))
	    predict = 2;
	else if (S.equals(weatherList[2]))
	    predict = 0;
	System.out.println(weatherList[predict]);
    }
}
