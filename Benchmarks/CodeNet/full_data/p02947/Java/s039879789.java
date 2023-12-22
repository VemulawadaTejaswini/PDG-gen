import java.util.*;
public class Main {
	static int N=0;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N=sc.nextInt();
		int total=0;
		char data[] =new char[10 * N];
		int total1[]=new int [N];
		
		
		for(int i=0;i<N;i++) {
			int total2=0;
			String S=sc.next();
			
			for(int j=0;j<10;j++) {
				if(i==0) {
			
				data[j]=S.charAt(j);
				
				total2 +=S.charAt(j)-97;
				
				}else {
					data[i*10+j]=S.charAt(j);
					
					total2 +=S.charAt(j)-97;
					
				}
			}
			
			total1[i]=total2;
		
			
			
		}
		int ans =0;
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
			if(i==j)continue;
			if(total1[i]==total1[j]) {
				ans++;
			}
			}
		}
		System.out.println(ans);
		
		
		
		
	
	
		
	}

}
