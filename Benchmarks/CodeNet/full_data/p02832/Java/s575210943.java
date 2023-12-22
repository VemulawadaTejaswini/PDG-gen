import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer res = Stream.generate(()->sc.nextInt()).limit(N)
                .reduce(0, (a, b)->{
                    if(b == a+1){
                        return a+1;
                    }else{
                        return a;
                    }
                });
        if(res == 0){
            System.out.println(-1);
        }else {
            System.out.println(N - res);
        }
    }
}
