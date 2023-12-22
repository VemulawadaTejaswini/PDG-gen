import java.util.*;

public class Main {
	
	public static void main(String[] args) {

		// argumentの取得
		Scanner s = new Scanner(System.in);

		String str = s.next();
                // String型
	        // String x = s.next();
      
        char []alphabet = new char[26];
        char c = 'a';
        for (int i = 0; i < 26; i++){
          alphabet[i] = c++;
          long count = Main.split(str , alphabet[i]);
          if (count % 2 != 0){
            System.out.println("No");
            return;
          }
        }
      
        // 最後まで走ったらYes
        System.out.println("Yes");
	
	} 
    
    public static int split(String str, char target){
        int count = 0;
      
        for (int i=0; i < str.length(); i++){
          if (str.charAt(i) == target)
              count ++;
        }
      
        return count;
    }
  
}