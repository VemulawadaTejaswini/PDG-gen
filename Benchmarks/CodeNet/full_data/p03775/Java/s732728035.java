import java.util.*;
import java.util.Arrays;

public class Main{
	static int F(int a,int b){
		int acount=0;
		int bcount=0;
		while(true){
			if(a/10==0){
				acount++;
				break;

			}
			else{
				acount++;
				a /=10;
			}
		}
		while(true){
			if(b/10==0){
				bcount++;
				break;

			}
			else{
				bcount++;
				b /=10;
			}
		}
		int f_score = Math.max(acount,bcount);
		return f_score;

	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] x = new int[(int)Math.sqrt(n)];
		int [] y = new int[(int)Math.sqrt(n)];
		final int num = n;
		int j=0;
		for(int i=1;i<Math.sqrt(n);i++){
			if(num%i==0){
				x[j] = i;
				y[j] = num/i;
				j++;
				
			}
		}
		int num_j = j;
		int min =100;
		for(int i=0;i<num_j;i++){
			int temp = F(x[i],y[i]);
			if(temp<min){
				min = temp;
			}

		
		}
		System.out.println(min);
		
		

	}
}









