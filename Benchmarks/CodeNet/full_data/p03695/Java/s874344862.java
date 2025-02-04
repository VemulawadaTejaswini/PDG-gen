import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] rates = new int[N];

        for (int i = 0; i < N; i++) {
            rates[i] = sc.nextInt();
        }

        int[] pointFlag = new int[9];
        for (int i = 0; i < 9; i++) {
            pointFlag[i] = 0;
        }

        for(int i = 0; i<N; i++){
            if(rates[i] >= 1 && rates[i] <= 399){
                pointFlag[0] = 1;
            }else if(rates[i] >= 400 && rates[i] <= 799){
                pointFlag[1] = 1;
            }else if(rates[i] >= 800 && rates[i] <= 1199){
                pointFlag[2] = 1;
            }else if(rates[i] >= 1200 && rates[i] <= 1599){
                pointFlag[3] = 1;
            }else if(rates[i] >= 1600 && rates[i] <= 1999){
                pointFlag[4] = 1;
            }else if(rates[i] >= 2000 && rates[i] <= 2399){
                pointFlag[5] = 1;
            }else if(rates[i] >= 2400 && rates[i] <= 2799){
                pointFlag[6] = 1;
            }else if(rates[i] >= 2800 && rates[i] <= 3199){
                pointFlag[7] = 1;
            }else if(rates[i] >= 3200){
                pointFlag[8] += 1;
            }
        }

        int minAns = 0;
        int maxAns = 0;
        for (int i = 0; i < 8; i++) {
            minAns += pointFlag[i];
            maxAns += pointFlag[i];
        }
        if(pointFlag[8] > minAns)minAns = pointFlag[8];
        maxAns += pointFlag[8];

        System.out.println(minAns+" "+maxAns);
    }
}