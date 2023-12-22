import java.util.*;
//import java.util.Arrays;

public class Main {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];
//        List<Integer> a = new ArrayList<>();

        int ball[] = new int[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();

        int half=n/2+1;

        for (int i=half-1; i<n; i++){
            if (a[i]==0){
                ball[i] = 0;
            }else{
                ball[i] = 1;
            }
        }


        for (int i=half-2; i>=0; i--){
            long sum = 0;
            for (int j=(i+1)*2; j<=n; j+=i+1){
//                long sum = 0;
                sum += ball[j-1];
            }if (sum%2==a[i]){
                ball[i] = 0;
            }else {
                ball[i] = 1;
            }
        }

//        System.out.println(ball[1]);
//
        int zero =0;
        for (int i=0; i<n; i++){
            if (ball[i]==0)zero++;
        }
        if (zero==n) System.out.println(0);
//
        else {
            List<Integer> ans = new ArrayList<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (ball[i] == 1) {
                    count++;
                    ans.add(i);
                }
            }
                System.out.println(count);
                for (int i = 0; i < ans.size(); i++) {
                    System.out.println(ans.get(i)+1);
            }
        }
    }
}
