
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		//long startTime = System.currentTimeMillis();
		
		Scanner sc=new Scanner(System.in);
		String moji=sc.next();
		char[] c=moji.toCharArray();
		int size=moji.length();
		
		int orikaeshi;
		if(size%2==0)orikaeshi=size/2-1;
		else orikaeshi=(size-1)/2-1;
		
		int count=0;
		
		for(int i=0;i<=orikaeshi;i++){
			if(c[i]!=c[size-1-i]){
				count++;
				//System.out.println(c[i]);
			}
		}
		
			System.out.println(count);
		
		
	}
}
