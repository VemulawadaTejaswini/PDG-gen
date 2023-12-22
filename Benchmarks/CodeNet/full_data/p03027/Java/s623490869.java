import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        int q = sc.nextInt();
		for(int i = 0; i < q; i++){
            long x = sc.nextInt();
            long d = sc.nextInt();
            long n = sc.nextInt();
            long result = x;
            for(int j = 1; j < n; j++){
                if (((x + j*d)%1000003)==0){
                    result=result*(x + j*d);
                } else{
                    result= result*(x + j*d)%1000003;
                }
            }
            System.out.println(result%1000003);
        }
       sc.close();

    }
}
