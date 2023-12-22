
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int K=stdIn.nextInt();
		int zero[]=new int[N];
		int one[]=new int[N];
		String S=stdIn.next();
		int z=0,y=0,x=0,count=0,max=0,w=0;
		boolean f0=false;
		boolean f1=false;
		for(int i=0;i<N;i++) {
			char ch=S.charAt(i);
			if(ch=='0') {
				if(f1&&zero[0]!=0) {
					x++;
					zero[x]++;
					f0=true;	
					f1=false;
				}
			}
			if(ch=='1') {
				if(f0&&one[0]!=0) {
					y++;
					one[y]++;
					f1=true;
					f0=false;
				}
			}
		}
		int st=0;
		int tmp=0;
		for(int i=0;i<N;i++,tmp++) {
			char ch=S.charAt(i);
			if(i==0&&st==0) {
				if(ch=='0') {
					count+=zero[0];
					count+=one[0];	
				}
				else {
					count+=one[0];
					st=1;
					i--;
				}
			}
			else {
			count+=zero[i];
			count+=one[i+st];
			}
			if(zero[i]==0||one[z+st]==0) {
				break;
			}
		}max=count;
		for(int i=tmp;i<=x;i++) {
			if(st==0&&w==0) {
				count-=zero[w];
				count+=zero[i];
				count+=one[i];
			}
			else {
				count-=zero[w];
				count-=one[w];
				count+=zero[i];
				count+=one[i+st];
			}
			if(max<count) {
				max=count;
			}
			
		}
		System.out.println(max);
	}
}