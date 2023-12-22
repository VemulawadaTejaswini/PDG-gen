import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
		String S = sc.next();
    int count1 = 0;
    for(int i = 0;i < S.length()-1;i++){
        if(S.charAt(i) == '#' && S.charAt(i) != S.charAt(i+1)){
	          count1++;
        }
    }
    System.out.println(count1);
  }
}