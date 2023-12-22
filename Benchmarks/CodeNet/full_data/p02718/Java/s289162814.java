import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int V;
        int temp;

        int[] a=new int[N];

        for(int i=0;i<a.length;i++)
        {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int sum = 0;
        for (int value : a) {
            sum += value;
        }

        V = (sum / (4*M));

        if (V > sum) {
            System.out.println("No");
        } else if (V >= a[N-M]) {
            System.out.println("No");
        }   else if (V< a[N-M]) {
                System.out.println("Yes");
            }
        else if ( V > a[N-1]) {
            System.out.println("No");
        }
         else {
            System.out.println("Yes");
        }
    }
}