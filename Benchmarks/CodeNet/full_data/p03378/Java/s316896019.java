import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] array = new int[n];
        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            array[a] = 1;
        }

        int costMinus = 0;
        int costPlus = 0;

        for(int i=x; i>=0; i--){
            costMinus+=array[i];
        }

        for(int i=x; i<n; i++){
            costPlus+=array[i];
        }

        System.out.println(Math.min(costMinus, costPlus));
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
