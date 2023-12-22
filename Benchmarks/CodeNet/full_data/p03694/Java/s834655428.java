import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        List<Integer> houses = new ArrayList<Integer>();
        while(sc.hasNextInt()) {
        	houses.add(sc.nextInt());
        }
        int max = Collections.max(houses);
        int min = Collections.min(houses);
        System.out.println(max-min);

	}

}
