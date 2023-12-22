
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt(); //お店の数
		int m=sc.nextInt(); //本数
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		String k[]=new String[n];
		for(int i=0;i<n;i++){
			k[i]=a[i]+"_"+b[i];
		}

		Arrays.sort(k);
		int count=0;
		long total=0;
		loop:for(int i=0;i<n;i++){
			for(int s=0;s<Integer.parseInt(k[i].substring(String.valueOf(a[i]).length()+1));s++){
				count++;
				total+=Integer.parseInt(k[i].substring(0,String.valueOf(a[i]).length()));
				if(count>=m){
					System.out.println(total);
					break loop;
				}
			}
		}

  }
}
