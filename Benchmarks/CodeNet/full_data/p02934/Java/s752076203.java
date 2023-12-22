import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elements = sc.nextInt();
        int[] value = new int[elements];
        for (int i = 0; i < elements; i++) {
            value[i] = sc.nextInt();
        }
        solve(value);
    }

    public static void solve(int[] value){
        double result = 0;
        for(int an : value){
            result += (double) 1/an;
        }
        result = 1/result;
        System.out.println(result);
    }
}