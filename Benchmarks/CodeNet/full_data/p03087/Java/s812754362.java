import java.util.Scanner;

class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String ss = sc.next();
		int[] l = new int[Q];
		int[] r = new int[Q];

		for(int i = 0;i < Q;i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}

		int[] ans = new int[Q];
		for(int i = 0;i < Q;i++){
			String sub = ss.substring(l[i]-1,r[i]);
			int index = 0;
			int count = 0;
			while(index < sub.length()){
				if(sub.charAt(index) == 'A' && index < sub.length()-1 && sub.charAt(index+1) == 'C'){
					count++;
				}
				index++;
			}
			ans[i] = count;
		}

		for(int i = 0;i < Q;i++){
			System.out.println(ans[i]);
		}


	}


}


class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


