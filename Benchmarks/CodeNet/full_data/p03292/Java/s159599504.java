import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        int keep = 0;
        a[0] = 0;
        a[1] = sc.nextInt();
        a[2] = sc.nextInt();
        a[3] = sc.nextInt();
        if(a[1]>a[2]){
            keep = a[1];
            a[1] = a[2];
            a[2] = keep;
        }
        if(a[2]>a[3]){
            keep = a[2];
            a[2] = a[3];
            a[3] = keep;
        }
        if(a[1]>a[2]){
            keep = a[1];
            a[1] = a[2];
            a[2] = keep;
        }
        System.out.println(a[3]-a[1]);
    }
}