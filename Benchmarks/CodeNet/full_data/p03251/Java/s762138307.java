import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	int a=0;
	int b,c,d;
	a = in.nextInt();	
	b= in.nextInt();
	c= in.nextInt();
	d= in.nextInt();
	int a1[]={};
	int b1[]={};
	int cc=0;
	for(int s=0;s<a;s++){
		a1[s]=in.nextInt();
	}
	for(int s2=0;s2<a;s2++){
		b1[s2]=in.nextInt();
	}
	Arrays.sort(a1);
	Arrays.sort(b1);
	for(int i=c;i<=d;i++){
		if((i>a1[a-1])&&((i<b1[0]))){
			System.out.println("No War");
			cc=1;
		}else if(i==d &&cc==0){
			System.out.println("War");
		}
		
		}
	}
}