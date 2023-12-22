import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		
		int tmp;
		int xx;
		
		bb--;
		
		tmp = (int)bb/(aa-1);
		xx = bb%(aa-1);
		
		if (xx == 0){
			System.out.print(tmp);
		}else{
			System.out.print(tmp+1);
		}
	}
}