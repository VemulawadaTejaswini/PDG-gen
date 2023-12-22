import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 String [] s = new String [N];

		 for(int i=0;i<N;i++) {
			 s[i] = scan.next();
		 }
		 scan.close();
		 long c=0;

		 for(int i=0;i<N-1;i++) {

			 for(int j=i+1;j<N;j++) {


				  if(permutation(s[i],s[j])) {
					  c++;
				  }
			 }
		 }
		 System.out.println(c);
	}
	static boolean permutation(String s,String t){
        if(s.length() != t.length()){
            return false;
        }

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