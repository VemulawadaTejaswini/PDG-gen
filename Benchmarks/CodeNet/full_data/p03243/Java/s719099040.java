mport java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in); 
		String s=sc.next();
		int i=0;
		int a=Math.max(s.charAt(i)-'0',s.charAt(i+1)-'0');
		int b=Math.max(a,s.charAt(i+2)-'0');
		System.out.print(b*111);
		
	}
}