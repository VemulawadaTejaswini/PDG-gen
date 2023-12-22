import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int cN,cM;
        cN = (n>1)?(n*(n-1))/2:0;
        cM = (m>1)?(m*(m-1))/2:0;
      /*  if(n>1){
            cN = (n*(n-1))/2;
        }else{
            cN = 0;
        }

        if(m>1){
            cM = (m*(m-1))/2;
        }else {
            cM = 0;
        }*/
        System.out.println(cM+cN);


    }
}
