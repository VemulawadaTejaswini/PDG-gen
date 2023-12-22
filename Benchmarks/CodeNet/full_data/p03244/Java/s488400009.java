import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] odd = new int[100001];
        int[] even = new int[100001];
        Arrays.fill(odd, 0);
        Arrays.fill(even, 0);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                odd[sc.nextInt()]++;
            } else {
                even[sc.nextInt()]++;
            }
        }
        int[] max_o = new int[2];
        int[] max_even =new int[2];
        int c = 0;
        for (int i = 0; i <=100000; i++) {
            if(max_o[0]<odd[i]){
                max_o[0]=odd[i];
                max_o[1]=i;
            }
            if(max_even[0]<even[i]){
                max_even[0]=even[i];
                max_even[1]=i;
            }
        }
        if(max_even[1]==max_o[1]){
            if(max_o[0]>max_even[0]){
                Arrays.sort(even);
                max_even[0]=even[99999];
            }else{
                Arrays.sort(odd);
                max_o[0]=odd[99999];
            }
        }
        System.out.println(n-max_o[0]-max_even[0]);
    }
}