import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int f=sc.nextInt();
		int sw=0;
		int s=0;
		double con=0;
		for(int i=0; 100*i*a<=f; i++){
			for(int j=0; 100*j*b+100*i*a<=f; j++){
				for(int t=0; t*c<=e*(a*i+b*j);t++){
					for(int k=0; t*c+d*k<=e*(a*i+b*j); k++){
						if(i+j+t+k==0) continue;
						if((100*(a*i+b*j)+c*t+d*k)<=f && con<(double)100*(c*t+d*k)/(100*(a*i+b*j)+c*t+d*k)){
							con=(double)100*(c*t+d*k)/(100*(a*i+b*j)+c*t+d*k);
							sw=100*(a*i+b*j)+c*t+d*k;
							s=c*t+d*k;
						}
					}
				}
			}
		}
		System.out.println(sw+" "+s);
	}
}
