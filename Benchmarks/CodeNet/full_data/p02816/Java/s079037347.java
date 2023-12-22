import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] newA = new int[n];
        for(int i=0;i<a.length;i++){
            a[i] = scan.nextInt();
        }
        for (int i=0;i<b.length;i++){
            b[i] = scan.nextInt();
        }
        for (int i=0;i<a.length;i++){
            newA[i] = a[i]^n;
        }
        for (int i=0;i<newA.length;i++){
            if (newA[i] == b[i])
                System.out.println(newA[i]);
        }
    }
}