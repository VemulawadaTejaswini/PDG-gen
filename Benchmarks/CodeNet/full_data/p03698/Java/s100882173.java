import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static boolean solve(String s){
		//System.out.println(s.charAt(0));
		int[] memo = new int[26];
		for(int i = 0;i < 26;i++){
			memo[i] = 0;
		}
		int index = -1;
		for(int i = 0;i < s.length();i++){
			index = (int)s.charAt(i) - 97;
			memo[index] += 1;
		}
		for(int i = 0;i < memo.length;i++){
			if(memo[i] > 1){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(solve(s)){
        	System.out.println("yes");
        }else{
        	System.out.println("no");
        }
    }

}