import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int l = in.nextInt();
        int[] a = new int[n];
        int index = -1;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if(a[i]+a[i+1]>=l){
                index = i+1;
                break;
            } 
        }

        if(index == -1){
            System.out.println("Impossible");
        }else{
            for (int i = 1; i < index; i++) {
                System.out.println(i);
            }
            for(int i = n-1; i >= index; i--){
                System.out.println(i);
            }
        }
    }
}