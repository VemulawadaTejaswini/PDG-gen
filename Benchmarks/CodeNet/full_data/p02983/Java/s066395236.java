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
        /*
        if((R - L) > 2019 ){
            System.out.println(0);
            return;
        }
        */
        int temp = 2019;
        for(int j=L;j < R;j++){
            for(int i = j+1;i < R+1;i++){
                int k = (j* i)%2019;
                if(k == 0)
                    debug("k,j,i:"+k+":"+j+":"+i);
                if(temp > k){
                    temp = k;

                }
                if(temp == 0){
                    break;
                }

            }
        }

        System.out.println(temp);
    }


}
