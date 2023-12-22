import java.util.*;
public class Main{
	public static void main(String[] args){
		int[] a = {-1,-1,-1,-1,-1,-1};
		int dis;
		boolean is = true;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 6; i++){
				a[i] = sc.nextInt();
		}
		for(int i = 0; i < 4; i++){
			dis = a[i+1] - a[i];
			if(dis > a[5]){
				System.out.println(":(");
					i = 6;
					is = false;
			}
		}
			if(is){
				System.out.println("Yay!");
			}
	}
}