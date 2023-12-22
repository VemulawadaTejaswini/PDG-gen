import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt()/1000;
        boolean b = true;
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n-i&&b;j++){
                if (9*i+4*j+n==y){
                    System.out.println(i+" "+j+" "+(n-i-j));
                    b = false;
                }
            }
        }
        if (b){
            System.out.println("-1 -1 -1");
        }




    }

}
