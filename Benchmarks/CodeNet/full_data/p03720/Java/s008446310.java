import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt(), m = in.nextInt();
        int [] roads_for_cities = new int[n];
        Arrays.fill(roads_for_cities, 0);
        for (int i = 0; i < m; i++){
            int a = in.nextInt();
            roads_for_cities[a-1]++;
            int b = in.nextInt();
            roads_for_cities[b-1]++;
        }
        for (int i = 0; i < n; i++) System.out.println(roads_for_cities[i]);
    }
    
}