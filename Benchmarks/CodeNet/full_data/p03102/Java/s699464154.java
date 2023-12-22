import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
	int e[]=new int[b];
	int count=0;
	int ans=0;
	for(int i=0;i<b;i++) {
		e[i]=scan.nextInt();
	}
	for(int i=0;i<a;i++) {
		count=0;
		for(int j=0;j<b;j++){
			int f=scan.nextInt()*e[j];
			count+=f;
		}
		if(count+c>0) {
			ans++;
		}
	}
	System.out.println(ans);
	}
}
