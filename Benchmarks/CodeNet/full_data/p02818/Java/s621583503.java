
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long takahashi = scanner.nextLong();
        long aoki = scanner.nextLong();
        long takahashikaisuu = scanner.nextLong();

       long takahashinokori = takahashi - takahashikaisuu;
       long aokinokori =0;
       if (takahashinokori < 0){
           aokinokori = aoki + takahashinokori;
           takahashinokori = 0;
           if (aokinokori <0){
               aokinokori = 0;
           }
       }
       else {
           aokinokori = aoki;
       }

            System.out.println(takahashinokori + " " + aokinokori);
        }
    }

