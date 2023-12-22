import java.util.*;

class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long x=sc.nextLong();
		long length[]=new long[n+1];
		long count=0;
		long pati[]=new long[n+1];
		//String s[]=new String[n+1];
		//s[0]="P";
		length[0]=1L;
		pati[0]=0L;
		for(int i=1;i<=n;++i) {
			//s[i]="B"+s[i-1]+"P"+s[i-1]+"B";
			length[i]=3+length[i-1]*2;
			pati[i]=1+2*pati[i-1];
		}
		
		//char c[]=s[n].toCharArray();
		int index=n;
		while(index>=0){
			if(x==1) {
				if(index==0)++count;
				break;
			}
			else if(x<=length[index]/2) {
				--index;
				--x;
			}
			else if(x==length[index]/2+1) {
				count=count+pati[index]+1;
				break;
			}
			else if(x==length[index]) {
				count = count+2*pati[index]+1;
				break;
			}
			else if(x>length[index]/2+1) {
				count =count+pati[index]+1;
				x=x-length[index]/2-1;
				--index;

			}

		}
		System.out.println(count);
	}
}
