import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String next = "Sunny";
        if (line.equals("Sunny")) {
        	next = "Cloudy";
        } else if (line.equals("Cloudy")) {
        	next = "Rainy";
        } else if (line.equals("Rainy")) {
        	next = "Sunny";
        }

        System.out.println(next);


    }

    



}