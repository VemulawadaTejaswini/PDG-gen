import java.util.*;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int HP = sc.nextInt();
        int hoge = sc.nextInt();
		List<Integer> waza = new ArrayList<Integer>();
		for(int i = 0; i < hoge; i++){
			waza.add(sc.nextInt());
		}
		Collections.sort(waza, Collections.reverseOrder());
		if(waza.get(0) + waza.get(1) >= HP){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}