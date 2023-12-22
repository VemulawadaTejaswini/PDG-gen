import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> plist = new ArrayList<>();
		plist.add(sc.nextInt());
		plist.add(sc.nextInt());
		plist.add(sc.nextInt());
		plist.add(sc.nextInt());
		Collections.sort(plist);

		if(plist.get(0)==1&&
		plist.get(1)==4&&
		plist.get(2)==7&&
		plist.get(3)==9){
			
		System.out.println("YES" );
		}else{
			
		System.out.println("NO" );
		}


	}
}