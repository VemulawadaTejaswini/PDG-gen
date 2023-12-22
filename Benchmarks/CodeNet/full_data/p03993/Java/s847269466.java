import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N;
        int[] a = new int[100000];
        int friend=0;
        
        N = sc.nextInt();

        for(int i=0;i<N;i++){
        	a[i] = sc.nextInt();
        }
        
        for(int i=0;i<N;i++){
        	int test = a[a[i]-1];
        	if(i+1==a[a[i]-1])friend++;
        }
        
        System.out.println(friend/2);
    }
}