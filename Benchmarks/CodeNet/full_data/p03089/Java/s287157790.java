import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = false;
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			b.add(sc.nextInt());
		}
		for(int i = 0; i < n; i++){
			for(int j = b.size() - 1; 0 <= j; j--){
				if(b.get(j) == j + 1){
					a.add(j + 1);
					flag = true;
                  	b.remove(j);
					break;
				}
			}
			if(flag = false){
				System.out.println(-1);
				break;
			}
		}
		for(int i = a.size() - 1; 0 <= i; i--){
			System.out.println(a.get(i));
		}
	}
}
