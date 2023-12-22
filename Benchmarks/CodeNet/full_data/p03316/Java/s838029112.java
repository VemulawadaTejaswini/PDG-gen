import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double num = N;

        double e;
        double sn = 0;
        double count;

        //桁数の算出
        e  = Math.ceil(Math.log10(N));
        
        //S(N)の算出
        for(int i = 0; i < e; i++){
            count = num % 10;
            sn += count;
            num = (num - count)/10;
        }

        //評価
        if(N % sn ==0 || N == 1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
