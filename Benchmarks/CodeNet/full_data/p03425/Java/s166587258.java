import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cnt = new int[5];
        for(int i = 0; i<N; i++) {
            String x = sc.next().substring(0,1);
            if(x.equals("M")) cnt[0]++;
            if(x.equals("A")) cnt[1]++;
            if(x.equals("R")) cnt[2]++;
            if(x.equals("C")) cnt[3]++;
            if(x.equals("H")) cnt[4]++;
        }

        int sum = 0;
        for(int i = 0; i<3; i++) {
            for(int j = i+1; j<4; j++) {
                for(int k = j+1; k<5; k++) {
                    sum +=  cnt[i]*cnt[j]*cnt[k];
                }
            }
        }
        System.out.println(sum);
    }
}