import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int h = a[0] - 1;
        for(int i=1; i<n; i++) {
            if(a[i] < h) {
                System.out.println("No");
                return;
            }
            h = Math.max(h, a[i]-1);
        }
        System.out.println("Yes");


    }

}
