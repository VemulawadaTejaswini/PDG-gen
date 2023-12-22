import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int x=0;
int n=sc.nextInt();
int ans=0;
String s=sc.next();
for(int i=0;i<n;i++) {
	if(s.charAt(i)=='I') {
		x=x+1;
	}else if(s.charAt(i)=='D'){
		x=x-1;
	}
	ans=Math.max(ans, x);
	
}System.out.println(ans);
	}

}
