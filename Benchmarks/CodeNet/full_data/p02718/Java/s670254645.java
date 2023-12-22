import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int M = sc.nextInt();

    	int[] a = new int[N];
    	int i = 0;
    	for(int k=0;k<N;k++) {
    		a[k] = sc.nextInt();
    	}
    	int sum = 0;
    	for(int j=0;j<N;j++) {
    		sum = sum + a[j];
    	}
    	float std = sum/(4*M);

    	int candidate = 0;
    	for(i=0;i<N;i++) {
    		if(a[i]>std) {
    			candidate = candidate + 1;
    		}
    	}
    	if(candidate >= M) {
    		System.out.println("Yes");
    	} else {
    		System.out.println("No");
    	}

    }
}