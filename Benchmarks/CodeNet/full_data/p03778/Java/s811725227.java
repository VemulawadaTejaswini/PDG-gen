import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		int W=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();
		
		if(a<b){
			if(b-(a+W)>0){
				System.out.println(b-(a+W));
			}else System.out.println(0);
		}
		if(a>b){
			if(a-(b+W)>0){
				System.out.println(a-(b+W));
			}else System.out.println(0);
		}
}

}
