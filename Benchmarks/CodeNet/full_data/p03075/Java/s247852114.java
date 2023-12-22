import java.util.*;

public class Main{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] dist =new int[5];
		for(int i=0;i<5;i++){
			dist[i]=sc.nextInt();
		}
		int limit =sc.nextInt();

		if(dist[4]-dist[0] <= limit){
			System.out.println("Yay!");
		}else{
			System.out.println(":(");
		}
	}
}