import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<n;i++)
			hs.add(sc.nextInt());
		if(hs.size()==n)
			System.out.println("YES");
		else 
			System.out.println("NO");
		
	}
}