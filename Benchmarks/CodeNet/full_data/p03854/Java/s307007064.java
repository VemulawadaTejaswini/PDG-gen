import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
	boolean flg = true;
	while(flg){
		String w = endWith(s);
		if(w != null){
			s = s.substring(0, s.length() - w.length());
		} else {
			flg = false;
		}
		
	}
	if(s.length() == 0){
		System.out.println("YES");
	} else {
		System.out.println("NO");
	}
  }
  
  public static String endWith(String str){
    	String[] words = {"dream","dreamer","erase","eraser"};
		for(String word: words){
			if(str.endsWith(word))return word;
		}
		return null;
  }
}