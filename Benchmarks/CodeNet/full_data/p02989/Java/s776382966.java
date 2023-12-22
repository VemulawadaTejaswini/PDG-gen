import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] d=new int[n];
		for(int i=0;i<n;i++){
			d[i]=sc.nextInt();
		}
		int ave=0;

		for(int i=0;i<n;i++){
			ave+=d[i];
		}
		ave/=n;
		int count=0;
		for(int i=ave-ave/2;i<ave+ave/2;i++){
			int carc=0;
			int cabc=0;

			for(int j=0;j<n;j++){
				if(d[j]>=i)
					carc++;
				else
					cabc++;
			}
			if(carc==cabc)
				count++;
		}
		System.out.println(count);
	}
}