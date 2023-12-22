import java.util.Scanner;

class Main{




	public static void main(String[] args) {





		Scanner sc = new Scanner(System.in);			//文字の入力
		int n = sc.nextInt();
		String s = sc.next();
		
		int ans = 0;
		int x = 0;
		for(int i = 0;i < n;i++){
			if(s.charAt(i) == 'I'){
				x++;
			}else{
				x--;
			}
			
			ans = Math.max(ans, x);
		}
System.out.println(ans);

	}
}


class Pair implements Comparable{
	Character from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


