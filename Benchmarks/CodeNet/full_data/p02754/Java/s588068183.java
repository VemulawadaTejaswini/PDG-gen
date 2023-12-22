import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		Integer a[] = new Integer[N];	
		int X =0;
		do{
        for (int i=0+X; i<A+X; i++) {
			if(N>i)
            a[i] = 1;
		}
	    for(int j=A; j<A+B+X; j++){
			if(N>j)
			a[j] = 0;
		}
		X=A+B;
		} while(N-A-B>0);
		
		int count = 0;
		for(int i=0; i<N; i++){
			if(a[i]==1){
				count++;
			}
		}
		
		System.out.println(count);

	}
}

