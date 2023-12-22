import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();  
        int a[] = new int[n];  
        for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
        for(int i = 0; i < n; i++) {
        	if(a[i]==1)count++;
        }
        System.out.println(count);
    }
}