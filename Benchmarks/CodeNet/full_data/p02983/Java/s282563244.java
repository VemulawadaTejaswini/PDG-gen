import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long res = 2020;
        if(b - a >= 2019){
            res = 0;
        }else{
            for(long i = a + 1; i <= b; i++){
                res = Math.min(res, (i * a) % 2019);
            }
            if(b - a >= 3){
                for(long i = a; i <= b; i++){
                    if(i == a + 1){
                        continue;
                    }else{
                        res = Math.min(res, (i * a + 1) % 2019);
                    }
                }
            }
        }
        System.out.println(res);
    }
}
