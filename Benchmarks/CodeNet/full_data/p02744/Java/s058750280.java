import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		char c = 'a';

		ArrayList<String> befAry = new ArrayList<String>();
		ArrayList<String> aftAry = new ArrayList<String>();
		befAry.add("a");
		aftAry.add("a");
		for (int i=2; i<=N; i++){
			aftAry = new ArrayList<String>();
			for (int j=0; j<befAry.size(); j++){
				String value = befAry.get(j);
				int kind = kindCount(value);
				for (int k=1; k<=kind + 1; k++){
					aftAry.add(value + String.valueOf((char)(c + (k-1))));
				}
			}
			befAry = aftAry;
		}
		System.out.println(aftAry);
	}

	public static int kindCount(String value){
		int cnt = 0;
		HashSet<String> set = new HashSet<String>();

		for (int i=0; i< value.length(); i++){
			set.add(value.substring(i, i+1));
		}
		return set.size();
	}
}