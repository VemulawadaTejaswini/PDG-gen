import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String inputStr = scanner.nextLine();
      int inputStrSize = inputStr.length();
      
      String before = "";
      String after = "";
      if (inputStrSize % 2 == 0) {
      	int splitPoint = inputStrSize / 2;
        before = inputStr.substring(0, splitPoint);
        after = inputStr.substring(splitPoint);
       	after = stringReverce(after);
      } else {
        int splitPoint = inputStrSize / 2;
        before = inputStr.substring(0, splitPoint);
        after = inputStr.substring(splitPoint + 1);
		after = stringReverce(after);
      } 
      	System.out.println(judgeCount(before, after));
    }
  
  	public static String stringReverce(String str) {
      StringBuffer sb = new StringBuffer(str);
      return sb.reverse().toString();
    }
  
  	public static int judgeCount(String str1, String str2) {
      int cnt = 0;
      int size = str1.length();
      for (int i = 0; i < size; i++) {
		if (!(str1.charAt(i) == str2.charAt(i))) {
        	cnt++;
        }
      }
      return cnt;
    }

}