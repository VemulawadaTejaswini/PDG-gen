import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner( System.in);
		int N,A,B,C;
		int a=0,b=0,c=0,d=0;
            
		for(int i=0;i<4;i++) {
			N=stdin.nextInt() ;
			if(N==1&&a==0)a++;
			if(N==9&&b==0)b++;
			if(N==7&&c==0)c++;
			if(N==4&&d==0)d++;
							
		}
     if(a+b+c+d>=4) {
    	 System.out.print("YES");
     }else {
    	 System.out.print("NO");
     }

            
           

	}
}
