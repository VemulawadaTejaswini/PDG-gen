import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        int count = 0;
        int i = 0;
		for(i = 0;i < N; i++){
          A[i] = sc.nextInt();
        }
		System.out.println(count);            
    }
}