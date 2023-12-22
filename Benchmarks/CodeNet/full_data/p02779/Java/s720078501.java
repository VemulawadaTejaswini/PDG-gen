import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < range; i++){
			list.add(sc.next()); 
		}
		for (String i : list){
			if(Collections.frequency(list, i) > 1){
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}	