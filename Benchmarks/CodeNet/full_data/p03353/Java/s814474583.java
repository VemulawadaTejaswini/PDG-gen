import java.util.Scanner;
import java.util.TreeSet;

class Main{


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		int k = sc.nextInt();
		TreeSet<String> set = new TreeSet<String>();
		for(int i = 0;i < string.length();i++){
			for(int j = i;j < string.length();j++){
				if(j - i > 5){
					break;
				}
				String x = string.substring(i, j+1);
				String y = string.substring(j+1);
//				System.out.println(x);
//				System.out.println(y);
				set.add(x);
				set.add(y);
			}
		}
		int count = 0;
		for(String ss:set){
			if(count == k){
			System.out.println(ss);
				return;
			}
			count++;
		}
	}





}



class Pair implements Comparable{
	int from;		//p
	int end;		//y
	int num;
	int bango;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}

