import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] s=new int[m][];
		for(int i=0;i<m;i++){
			int ki=sc.nextInt();
			s[i]=new int[ki];
			for(int j=0;j<ki;j++){
				s[i][j]=sc.nextInt()-1;
			}
		}
		int[] p=new int[m];
		for(int i=0;i<m;i++){
			p[i]=sc.nextInt();
		}
		
		int r=0;
		loop:
		for(int f=0;f<(1<<n);f++){
			for(int i=0;i<m;i++){
				int c=0;
				for(int j=0;j<s[i].length;j++){
					if((f&(1<<s[i][j]))>0)
						c++;
				}
				if(c%2!=p[i])
					continue loop;
			}
			r++;
		}
		System.out.println(r);
			

	}
}