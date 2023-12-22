import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		LinkedList<Integer> list = new LinkedList<>();
		boolean flag = false;
		for(int i=0;i<n;i++){
			int a = scanner.nextInt();
			if(flag){
				list.addFirst(a);
			}else{
				list.addLast(a);
			}
			flag = !flag;
		}
		if(flag){
			for(int i=n-1;i>=0;i--){
				System.out.print(list.get(i));
				if(i > 0){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		}else{
			for(int i=0;i<list.size();i++){
				System.out.print(list.get(i));
				if(i < list.size()-1){
					System.out.print(" ");
				}else{
					System.out.println();
				}
			}
		}


	}

}
