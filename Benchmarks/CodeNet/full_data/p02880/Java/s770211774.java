import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(IntStream.rangeClosed(1,9)
                .filter(i->
                        IntStream.rangeClosed(1, 9)
                                .filter(j->i*j==N)
                                .findAny()
                                .isPresent()
                )
                .findAny()
                .isPresent()
        ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        return;
    }
}
