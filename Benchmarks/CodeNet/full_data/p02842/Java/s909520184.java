import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		
		int xx = (int) nn * 100 / 108;
		
		if((xx * 108) == nn * 100){
			System.out.print(xx);
		}else{
			System.out.print(":(");
		}
	}
}