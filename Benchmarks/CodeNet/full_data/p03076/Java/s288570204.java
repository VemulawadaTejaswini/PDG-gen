import java.util.*;
public class Main{
public static void main(String arg[]){
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	int b[]=new int[5];
	int c=0,s=0;
	for(int i=0;i<5;i++){
		 a[i]=sc.nextInt();
		s=s+a[i];
		if(a[i]%10!=0){
			b[c]=10-(a[i]%10);
		c++;
		}
	}
	Arrays.sort(b);
	for(int i=0;i<4;i++){
	if(b[i]!=0)
	s=s+b[i];
	}
	System.out.println(s);
}
}