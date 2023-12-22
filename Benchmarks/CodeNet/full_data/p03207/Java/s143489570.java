import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int pricelist[] = new int[n];
        for (int i = 0; i < n; i++){
            pricelist[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(pricelist);
        int sum = 0;
        for(int i: pricelist){
            sum += i;
        }
        System.out.println(sum - pricelist[n-1]/2);
    }
}