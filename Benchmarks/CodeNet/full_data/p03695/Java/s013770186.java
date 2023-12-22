import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{
	static final Scanner s=new Scanner(System.in);
	static int getInt(){
		return Integer.parseInt(s.next());
	}
	static IntStream REPS(int r){
		return IntStream.range(0,r);
	}
	static IntStream REPS(int l,int r){
		return IntStream.rangeClosed(l,r);
	}
	static IntStream INTS(int l){
		return REPS(l).map(i->getInt());
	}
	public static void main(String[] __){
		int n=s.nextInt();
		int[] color=new int[9];
		for(int i=0;i<n;i++){
			int latte=getInt();
			if(latte<400)
				color[0]++;
			else if(latte<800)
				color[1]++;
			else if(latte<1200)
				color[2]++;
			else if(latte<1600)
				color[3]++;
			else if(latte<2000)
				color[4]++;
			else if(latte<2400)
				color[5]++;
			else if(latte<2800)
				color[6]++;
			else if(latte<3200)
				color[7]++;
			else
				color[8]++;
		}
		
		
		long v=Arrays.stream(color).limit(8).filter(i->i>0).count();
		System.out.printf("%d %d\n",
				v,
				v+color[8]
				);
	}
}
