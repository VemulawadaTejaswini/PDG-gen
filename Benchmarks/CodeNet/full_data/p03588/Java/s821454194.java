
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int j = 0;
        for (int i = 0;i < i1;++i){
            int k = scanner.nextInt();
            if(k > max){
                j = k + scanner.nextInt();
            }
        }
        System.out.println(j);
    }





}