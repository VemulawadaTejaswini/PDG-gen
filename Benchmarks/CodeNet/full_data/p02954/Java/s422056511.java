import java.util.*;
public class Main {
static int N= 0;

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		int data[]=new int [s.length()];
		int mov[]=new int[s.length()];
		char c[] =new char[s.length()];
		for(int i=0;i<data.length;i++) {
			data[i]=1;
			c[i]=s.charAt(i);
			
		}
		for(int j=0;j<1000;j++) {
		for(int i=0;i<data.length;i++) {
			if(c[i]=='R') {
			mov[i+1] +=data[i];	
			}else {
			mov[i-1] +=data[i];
			}
		}
		for(int i=0;i<data.length;i++) {
			data[i]=mov[i];
			mov[i]=0;
		}
		}
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");
			
		}
		
		
		
		
}
}
