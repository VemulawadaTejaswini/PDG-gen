import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char c[]=new char[n+2];
		String str=sc.next();
		for(int i=0;i<n;i++) {
			c[i]=str.charAt(i);
		}
		c[n]=c[0];
		c[n+1]=c[1];
		boolean a[]=new boolean [4];
		boolean t=true;
		for(int i=0;i<4;i++) {
			if(i==0) {
				a[0]=str(c,n,'s','s');
			}else if(i==1) {
				a[1]=str(c,n,'s','w');
			}else if(i==2) {
				a[2]=str(c,n,'w','s');
			}else if(i==3) {
				a[3]=str(c,n,'w','w');
			}
			
			if(a[i]) {
				t=false;
				break;
			}
		}
		
		if(t){
			System.out.println("-1");
		}
		
		
		
		
	}
	public static boolean str(char c[],int n,char c1,char c2){
		char s1[]=new char[c.length];
		s1[0]=c1;
		s1[1]=c2;
		for(int i=1;i<n+1;i++){
			if(c[i]=='o'){
				if(s1[i]=='s'){
					if(s1[i-1]=='s'){
						s1[i+1]='s';
					}else{
						s1[i+1]='w';
					}
				}else{
					if(s1[i-1]=='s'){
						s1[i+1]='w';
					}else{
						s1[i+1]='s';
					}
				}
				
			}else{
				if(s1[i]=='s'){
					if(s1[i-1]=='s'){
						s1[i+1]='w';
					}else{
						s1[i+1]='s';
					}
				}else{
					if(s1[i-1]=='s'){
						s1[i+1]='s';
					}else{
						s1[i+1]='w';
					}
				}
			}
		}
		if(s1[n]==s1[0]&&s1[n+1]==s1[1]) {
			for(int i=0;i<n;i++) {
				System.out.print(Character.toUpperCase(s1[i]));
			}
			return true;
		}else {
			return false;
		}
		
		
	}
	

}