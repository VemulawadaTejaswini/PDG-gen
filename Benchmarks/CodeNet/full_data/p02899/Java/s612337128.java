import java.util.*;

public class Main{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = sc.nextInt();
		List<Info> list = new ArrayList<>(n);
		for(int i = 0; i < n; ++i){
			list.add(new Info(i + 1, sc.nextInt()));
		}
		
		list.sort((info0, info1) -> info0.num - info1.num);
		
		for(int i = 0; i < n; ++i){
			char c = (i == n - 1) ? '\n' : ' ';
			System.out.print(list.get(i).id);
			System.out.print(c);
		}
	}
}

class Info {
	int id;
	int num;
	
	public Info(int id, int num){
		this.id = id;
		this.num = num;
	}
}