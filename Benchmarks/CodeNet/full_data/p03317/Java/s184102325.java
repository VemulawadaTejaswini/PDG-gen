import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        int key;
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println((n-1/k-1)+1);
    }
}
