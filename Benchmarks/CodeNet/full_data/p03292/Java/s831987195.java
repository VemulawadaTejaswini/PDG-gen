import java.util.*;
import java.lang.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0;i<3;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int result = a[2] - a[0];
        System.out.println(result);
        sc.close();
    }
}