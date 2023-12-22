import java.util.*;

class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=1;i<n;i++){
			int a=sc.nextInt()-1;
			num[a]++;
		}
		
		for(int nn:num){
			System.out.println(nn);
		}
	}
}