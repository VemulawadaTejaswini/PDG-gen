import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();

	int ans = 0;
	for(int i = 0; i < s.length(); i++){
	    if(s.charAt(i) == '+'){
		ans++;
	    }else if(s.charAt(i) == '-'){
		ans--;
	    }
	}
	System.out.println(ans);
    }
}
