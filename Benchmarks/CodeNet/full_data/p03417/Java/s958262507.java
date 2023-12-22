import java.util.*;

public class Main {

    public static  void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int min = Math.min(n,m);
        int max = Math.max(n,m);
        if(min == 1){
            if(max == 1){
                System.out.println(1);
            }else if(max == 2){
                System.out.println(0);
            }else {
                System.out.println(max-2);
            }
        }else if(min == 2){
            System.out.println(0);
        }else {
            System.out.println((max-2)*(min-2));
        }
    }
}