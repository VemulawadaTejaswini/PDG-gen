import java.util.Scanner;

class Main{
	public static void main(String[] $){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[]s=new int[m];
		int[]p=new int[m];
		int o=0;
		for(int i=0;i<m;i++){
			int l=0;
			int k=sc.nextInt();
			for(int j=0;j<k;j++){
				l=l|1<<(sc.nextInt()-1);
			}
			s[i]=l;
		}
		for (int i=0;i<1<<n;i++){
			for(int j=0;j<m;j++){
				if(i==0)
					p[j]=sc.nextInt();
				int k=s[j]&i;
				if(Integer.bitCount(k)%2!=p[j]){
					o--;
					if(i!=0)
					break;
					}
			}
				o++;
		}
			System.out.println(o);
	}
}
