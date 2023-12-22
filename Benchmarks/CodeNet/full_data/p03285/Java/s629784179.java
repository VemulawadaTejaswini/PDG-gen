import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d1 = 4;
        int d2 = 7;
        
        for(int i=d1;i<=n;i+=d1){
            if(i==n){
                System.out.print("Yes");
                System.exit(0);
            }
        }
        for(int j=d2;j<=n;j+=d2){
            if(j==n){
                System.out.print("Yes");
                System.exit(0);
            }
        }
        for(int k=d1+d2;k<=n;k+=d1+d2){
            if(k==n){
                System.out.print("Yes");
                System.exit(0);
            }
        }
        System.out.print("No");
    }
}