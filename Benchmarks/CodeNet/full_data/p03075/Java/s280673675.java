import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++)
			a[i]=sc.nextInt();
		int k=sc.nextInt();
		int c=0;
		for(int i=0;i<4;i++){
			for(int j=i+1;j<5;j++){
				if((a[j]-a[i])>k){
					c++;
					System.out.println(":(");
					break;
				}
				}
			if(c>0)
						break;
		}
		if(c==0)
			System.out.println("Yay!");
	}
}