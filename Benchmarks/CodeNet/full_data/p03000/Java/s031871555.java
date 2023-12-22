import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		int[] l=new int[n];
		for(int i=0;i<n;i++){
			l[i]=sc.nextInt();
		}
		int dis=0;
		int count=1;
		for(int i=0;i<n;i++){
			dis=dis+l[i];
			count++;
			if(dis>x){
				System.out.println(count-1);
				return;
			}
		}
	}
		
}