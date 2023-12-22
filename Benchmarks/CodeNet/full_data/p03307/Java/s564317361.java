import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 0;
        N = scanner.nextInt();
       if(N % 2==0){
           System.out.println(N);
        }else{
           System.out.println(2*N);
       }
    }

}
