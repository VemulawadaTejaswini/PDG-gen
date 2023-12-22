import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s[] = new String[n];
		int cnt = 0;
		for(int i = 0; i < n; i++){
			s[i] = sc.next();
		}

		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++){
				if(permutation_2(s[i], s[j])){
					cnt++;

				}

			}
		}
		System.out.print(cnt);
	}

	static boolean permutation_2(String s,String t){

        int[] letters = new int[256]; //文字コードの仮定;

        char[] s_array = s.toCharArray();
        for(char c:s_array){
            letters[c]++;
        }

        for(int i=0;i<t.length();i++){
            int c = (int)t.charAt(i);
            if(--letters[c] < 0){
                return false;
            }
        }
        return true;
    }

}