import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        int n;

        n = sc.nextInt();

//        int[] a = new int[n];
//        for(int i = 0;i < n;i++){
//            a[i] = sc.nextInt();
//        }
//

        if(n < 1200)
        System.out.println("ABC");
        else if(n < 2800)
        System.out.println("ARC");
        else
        System.out.println("AGC");
    }
}