import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt(),m=in.nextInt(),k=in.nextInt();
        if (k == 0){
            System.out.println("Yes");
        }
        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j <=m ; j++) {
                if (i *(m-j) + j *(n-i) == k){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}













