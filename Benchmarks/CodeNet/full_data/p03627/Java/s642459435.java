import java.util.Arrays;
import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int w=0,h=0;
	int d[]=new int[a];
	int count=0;
	for(int i=0;i<a;i++) {
		d[i]=scan.nextInt();
	}
	Arrays.sort(d);
	for(int i=a-1;i>0;i--) {
		if(d[i]==d[i-1]) {
			i--;
			if(count==0) {
				w=d[i-1];
				count++;
			}
			else {
				h=d[i-1];
				break;
			}
		}
	}
	System.out.println(w*h);
	}
}