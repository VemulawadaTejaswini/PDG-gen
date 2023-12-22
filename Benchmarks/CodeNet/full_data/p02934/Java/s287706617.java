import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<a.length;i++) {
            a[i] = stdIn.nextInt();
            //System.out.println(a[i]);
        }
        double sum = 0;
        for(int i = 0;i<a.length;i++) {
            //System.out.println(a[i]);
            sum += (double)1/a[i];
        }
        //System.out.println(sum);
       System.out.println(1/sum);
    }
}