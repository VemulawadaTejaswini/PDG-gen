import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] b = new int[n];
        for(int i = 0; i<n+1; i++) {
            a[i] = sc.nextInt();
        }

        for(int i = 0; i<n; i++) {
            b[i] = sc.nextInt();
        }
        long monsters = 0;
        for(int i = 0; i<n; i++) {

            if(a[i]>=b[i]) {
                monsters += b[i];
                //System.out.println(monsters + " " + a[i+1]);
                continue;
            }
            //System.out.println(b[i]);
            monsters += a[i];
            b[i] = b[i]-a[i];
            //System.out.println(b[i]);
            //System.out.println("monsters" + monsters);
            monsters += Math.min(a[i+1],b[i]);
            a[i+1] = Math.max(0,a[i+1]-b[i]);
            //System.out.println(monsters + " " + a[i+1]);
        }
        System.out.println(monsters);
    }
}