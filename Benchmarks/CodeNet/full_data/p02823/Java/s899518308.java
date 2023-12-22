import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			final int n= scn.nextInt();
			final int a = scn.nextInt();
			final int b = scn.nextInt();
			int x = 1;
			
			int s = b-a;
			
			int ret;
			if(s%2 == 1){
			    if(n-b<a-x){
			        ret = n-a;
			    }else{
			        ret = b-x;
			    }
			}else{
			    ret = s/2;
			}
			
			if (ret > n/2){
			    if(n-b<a-x){
			        ret = n/2 - (n-b);
			    }else{
			        ret = n/2 - (a-x);
			    }
			}
			
			System.out.println(ret);
		}
	}
}