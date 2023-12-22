import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int alice = 0;
        int bob = 0;
        for(int i=0; i<n; i+=2){
            alice = alice + a[i];
        }
        for(int i=1; i<n; i+=2){
            bob = bob + a[i];
        }
        System.out.println(alice - bob);
    }
}
