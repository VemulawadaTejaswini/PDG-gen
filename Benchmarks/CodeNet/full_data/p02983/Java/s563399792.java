import java.util.Scanner;

public class Main {
    public static void debug(String str) {
        boolean debug = false;
        if (debug != false) {
            return;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {

        int L;
        int R;
        int[][] xList;
        try (Scanner sc = new Scanner(System.in)) {
            L = sc.nextInt();
            R = sc.nextInt();
        }
        if((R - L) >= 2019 ){
            System.out.println(0);
            return;
        }
        int temp = 2019;
        for(int j=1;j < (R - L) +1;j++){
            for(int i = L+j;i < R+1;i++){
                int k = (L* i)%2019;
                if(temp > k){
                    temp = k;
                }
            }
        }

        System.out.println(temp);
    }


}
