import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int x = s.nextInt();
		int[] a = new int[N];
		int[] a2 =new int[N];
		for(int i=0;i<N;i++){
			a[i]=s.nextInt();
		}
		int min=a[0];
		int minno=0;
		for(int i=1;i<N;i++){
			min=Math.min(min, a[i]);
			if(min==a[i]){
				minno=i;
			}
		}
		
		long t= a[minno];
		int count = 0;
		int countm = 0;
		int t2=a[minno];
		a2[minno]=a[minno];

		for(int i=minno+1;i<N;i++){
			if(a[i]<=t+x){
				count=0;
				t=a[i];
				a2[i]=a[i];
				t2=a[i];
			}else{
				count++;
				t=t+x;
				a2[i]=t2;
			}
			if(count>countm){
				countm=count;
			}
		}
		for(int i=0;i<minno;i++){
			if(a[i]<=t+x){
				count=0;
				t=a[i];
				a2[i]=a[i];
				t2=a[i];
			}else{
				count++;
				t=t+x;
				a2[i]=t2;
			}
			if(count>countm){
				countm=count;
			}
		}
		
		long result=(long)countm*x;
		for(int i=0;i<N;i++){
			result+=(long)a2[i];
		}
		System.out.println(result);
	}
}