
import java.util.Scanner;

class NewClass4 {
        

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        int[] a = new int[n];
        int[] h = new int[n];
        for(int i=0;i<n;i++) {
                h[i] = in.nextInt();
        }
        for(int i=0;i<n;i++) {
                a[i] = Integer.MAX_VALUE;
        }
        a[0] = 0;
        for(int i=0;i<n;i++) {
            for(int j = i+1; j<i+k; j++){
                
                if(i <n-j)a[i+j] = Math.min(a[i+j], a[i]+Math.abs(h[i]-h[i+j]));
            }
        }
        System.out.println(a[n-1]);
    }

}