import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int xor = 0;
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            xor ^= a[i];
        }
        if(xor == 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }



}
