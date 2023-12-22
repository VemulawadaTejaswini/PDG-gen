import java.util.*;
public class Main {
static int N= 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		int data[]= {9,900,90000};
				
		ArrayList<Integer> al =new ArrayList<Integer>();
		int count = 0;
		int keta=0;
		int a=N;
		while(true) {
	    int t =a%10;
		a=a/10;
		keta++;
		al.add(t);
		if(a<1) break;
	
		
		}
		
		int j=0;
		for(int i=0;i<keta-1;i+=2) {	
			
			
			count += data[j];
			j++;
		}
		if(keta %2 != 0) {
			
			
			count+= N-Math.pow(10,keta-1)+1;
		}
		
		
		System.out.println(count);
}
}
