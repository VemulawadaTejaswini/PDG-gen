import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = sc.nextInt();
            total += ans[i];
        }

        Arrays.sort(ans);

        for (int i = 1; i < n; i++){
            if(i==n){
                System.out.println("0");
            }
            if (total % 10 == 0) {
                total=0;
                for(int j=i;j<ans.length;j++){
                    total+=ans[j];
                }
            } else {
                System.out.println(total);
                break;
            }
        }
    }


}