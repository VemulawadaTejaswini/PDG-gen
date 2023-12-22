import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<n;i++){
            a[i] = sc.next();
        }


        if((a[0]+a[1]+a[2]+a[3]+a[4])>=h){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


    }
}
