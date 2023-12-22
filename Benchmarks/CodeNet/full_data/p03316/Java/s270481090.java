import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;

        int e;
        int sn = 0;
        int count;

        //桁数の算出
        e  = (int)Math.log10(N) + 1;
        
        //S(N)の算出
        for(int i = 0; i < e; i++){
            count = num % 10;
            sn += count;
            num = (num - count)/10;
        }

        //評価
        if(N % sn == 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
