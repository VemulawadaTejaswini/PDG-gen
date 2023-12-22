import java.util.*;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int d = sc.nextInt();
        int x =sc.nextInt();
        int choco =0;
        int a[] = new int[n];
        for (int i =0;i<n;i++){
            a[i] =sc.nextInt();
        }
        for (int i=0; i<n ;i++){
            int cnt=0;
            while(cnt*a[i]+1 <= d) {
                cnt++;
                choco += 1;
            }
        }
        choco += x;
        System.out.println(choco);
	}

}
