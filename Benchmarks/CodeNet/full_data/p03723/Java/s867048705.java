import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		Set<String> s=new HashSet<String>();
		int a=0,b=0,c=0;
		int count=0;
		while(true){
	

			count++;
			a=(B>>1)+(C>>1);
			b=(A>>1)+(C>>1);
			c=(A>>1)+(B>>1);
			if(a%2==1||b%2==1||c%2==1) break;
			String str=String.format("%010d", a)+String.format("%010d", b)+String.format("%010d", c);
			if(s.contains(str)){
				count=-1;
				break;
			}
			s.add(str);
			A=a;B=b;C=c;
		}
		System.out.println(count);
	}
	

}