import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double max = 1;

        for(int i=1; i<=n; i++){
            double pow = 0;
            for(int j=2; j<=n; j++){
                pow = Math.pow(i, j);
                if(pow > n){
                    break;
                }
                if(pow >= max){
                    max = pow;
                }
            }
        }

        System.out.println((int)max);
    }

    public static void printArray(int[] array){
        for(int i=0; i<array.length; i++){
            if(i == array.length){
                System.out.println(array[i]);
            } else {
                System.out.print(String.format("%d ", array[i]));
            }
        }
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
}
