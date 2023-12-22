import java.util.*;
import java.util.Arrays;

class Main{
	public static void main(String args[]){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int a[] = new int[(n-1)*2];
		for (int count = 0; count < n; count++){
			a[count]=stdIn.nextInt();
		}
	
		int f = 0;
		int s = 0;
		int fsm =0;
		
		for (int count = 0; count < n; count++){
			if (a[count]==1){
				f=count;
			}else if (a[count]==n){
				s=count;
			}
		}
		
		
		if (Math.abs(f-s-1)%2==0){
			fsm=(Math.abs((f-s-1)))/2;
		}else{
			fsm=(Math.abs(f-s-1))/2+1;
		}
		
		if (f<s){
			fsm=fsm+f;
		}else{
			fsm=fsm+(n-f)-1;
		}
		
		if ((n-2)/2<fsm){
			System.out.println("Fennec");
		}else{
			System.out.println("Snuke");
		}
	}
}