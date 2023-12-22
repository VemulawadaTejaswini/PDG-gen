import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Integer> list = new ArrayList<Integer>();

		int count = 0;
		boolean saisyo = true;
		for (int i = 0; i < n; i++) {
			int add = scan.nextInt();
			list.add(add);
			if(list.get(i)%2==1) {
				saisyo=false;
				break;
			}
		}

			if(saisyo==false) {
				System.out.println(0);
			}else {

				for(int i=0;;i++) {
					//if(saisyo==true) {
					int temp=list.get(i);
					if(temp%2==0) {
					temp = temp/2;
					list.add(temp);
					}else {

						//saisyo=false;
						break;
				}



			}

				count=list.size()/n-1;
				//System.out.println(list);
				System.out.println(count);

			}
	}
}