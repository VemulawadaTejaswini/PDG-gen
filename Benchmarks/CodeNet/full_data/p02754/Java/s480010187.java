import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int aCount = 0;
		int nCount=n;
		for(int i = 0;i<nCount;i++){
			if(n-a>0){
				aCount+=a;	
				n-=a;
			}else{
				aCount +=n;
				break;
			}
			if(n-b<0){
				break;
			}
			n-=b;
		}
		System.out.print(aCount);
	}
}