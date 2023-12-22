import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] a=new int[N];
		for(int i=0;i<N;i++)a[i]=sc.nextInt();
		
		int pl=0;
		int count=1;
		for(int i=1;i<N;i++){
			if(pl==1 && a[i]-a[i-1]<0){
				count++;
				pl=0;
			}
			else if(pl==-1 && a[i]-a[i-1]>0){
				count++;
				pl=0;
			}
			else{
				if(a[i]-a[i-1]>0)pl=1;
				else pl=-1;
			}
		}
		System.out.println(count);
	}
}
