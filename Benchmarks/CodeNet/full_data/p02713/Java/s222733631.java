import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        short n;
        short gcd;
        int sum = 0;
        for (int x = 1; x <= k; x++) {
            for (int y = 1; y <= k; y++) {
                for (int z = 1; z <= k; z++) {
                    n = 2;
                    gcd = 1;
                    if(x==1&&y==1&&z==1){
                        
                    }else{
                        while (x >= n || y >= n || z >= n) {
                            if (x % n == 0 && y % n == 0 && z % n == 0) {
                                gcd = n;
                            }
                            n++;
                        
                    }
                    sum += (int)gcd;
                }
            }
        }
        System.out.println(sum);
    }
}