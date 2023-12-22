import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []a= new int[N];
		for(int i=0;i<N;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<N-1;i++) {
			for(int j=0;j<N-1-i;j++){
				if(a[j]<a[j+1]) {
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1]= temp;
			}
		}
	}
		int countA=0;
		int countB=0;
		for(int i=0;i<N;i++) {
			if(i%2==0) {
				countA+=a[i];
			}
			else if(i%2==1){
				countB+=a[i];
			}
		}
		System.out.println(countA-countB);
		}
		}