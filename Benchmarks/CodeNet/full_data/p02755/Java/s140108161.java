import java.util.*;

public class Main {

    static final int MOD=1000000007;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        for(int i=1;i<=100;i++){
            double eight = i*0.08;
            double ten = i*0.1;
            eight=Math.floor(eight);
            ten = Math.floor(ten);
            if(eight==a&&ten==b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);


    }
}



