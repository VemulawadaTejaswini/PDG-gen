import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

 
public class Main {
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		List<String> list = new LinkedList<>();
		list.add(S);
		int Q = sc.nextInt();
		int reverceCount = 0;
		
		for(int i = 0; i < Q; i++) {
			int query = sc.nextInt();
			if(query == 1) {
				reverceCount++;
				
			}else if(query == 2) {
				//反転している状態なら指示と逆に付与
				if(reverceCount % 2 == 1) {
					int F = sc.nextInt();
					if(F == 1) {
						list.add(sc.next());
					}else if(F == 2) {
						list.add(0, sc.next());
					}
					
				}else {
					//反転していない状態
					int F = sc.nextInt();
					if(F == 1) {
						list.add(0, sc.next());
					}else if(F == 2) {
						list.add(sc.next());
					}
				}
			}
		}

		//最後に反転する必要があるなら反転
		if(reverceCount % 2 == 1) {
			for (int i = list.size() - 1; i >= 0; i--) {
				System.out.print(list.get(i));
			}
		}else {
			for (int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i));
			}
		}
		
		sc.close();
	}
	
}