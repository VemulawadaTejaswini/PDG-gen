import java.util.*;
public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.next());

        int price = 0;
        int[] priceArray = new int [N];

        for(int i =0; i < N; i++){
            price = Integer.parseInt(scan.next());
            priceArray[i] = price;
        }

        Arrays.sort(priceArray);
        priceArray[N-1] = priceArray[N-1] / 2;

        int ans = 0;
        for(int i =0; i < N; i++){
            ans += priceArray[i];
        }

        System.out.println(ans);
    }
}