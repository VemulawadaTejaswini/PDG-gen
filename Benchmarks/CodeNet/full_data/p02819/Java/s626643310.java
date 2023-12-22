
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static boolean ch(ArrayList<Integer> l,int num) {
		boolean flag = true;
		for(int i = 0; i < l.size();i++) {
			if(num%l.get(i)==0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(2);
		int ans = 3;
		if(N==2) {
			System.out.println(2);
		}else {
			while(true) {
				boolean d = ch(intList,ans);
				if(d == true) {
					if(ans>=N) {
						System.out.println(ans);
						break;
					}else {
						intList.add(ans);
					}
				}
              ans = ans + 2;
			}
		}


	}

}
