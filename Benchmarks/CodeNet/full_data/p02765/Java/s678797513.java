import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

    public static void main(final String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPeople;
		try {
			numberOfPeople = Integer.parseInt(br.readLine());
		
        Long numberOfCoordinates[] = new Long[numberOfPeople];
        
        String string[] = br.readLine().split(" ");
        for (int i = 0; i < numberOfPeople; i++){
            numberOfCoordinates[i] = Long.parseLong(string[i]);
        }

        long output = Long.MAX_VALUE;

        for(int i = 0; i <= 100; i++){
            long cost = 0;
            for (int j = 0; j < numberOfPeople; j++){
                cost += Math.pow(numberOfCoordinates[j]-i,2);
            }
            output = Math.min(output,cost);
        }

        System.out.println(output);

    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }
  
}