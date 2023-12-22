import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	String s = sc.next();
	String t = sc.next();

	boolian judge = false;
	for(int i = 0; i < s.length(); i++){
	    if(s.equals(t)){
		judge = true;
		break;
	    }
	    char c = s.charAt(s.length()-1);
	    String C = String.valueOf(c);
	    s = s.substring(0, s.length()-1);
	    s = C+s;
	}

	if(flag == 1){
	    System.out.println("Yes");
	}else{
	    System.out.println("No");
	}
    }
}