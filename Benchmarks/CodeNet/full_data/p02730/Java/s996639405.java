import java .util.ArrayList;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String inputS = sc.next();

	ArrayList<String>  slist = new ArrayList<>();
	ArrayList<String>  first = new ArrayList<>();
	ArrayList<String>  second = new ArrayList<>();

	for(int i = 0; i < inputS.length(); i++) {
		slist.add(inputS.substring(i, i+1));
	}

	for(int i = 0; i < (inputS.length() - 1) /2; i++) {
			first.add(slist.get(i));
	}

	for(int i = (inputS.length() + 3) / 2 -1; i < inputS.length(); i ++) {
		second.add(slist.get(i));
	}

	String str1 = String.join("", first);
	String str2 = String.join("", second);

	if(isPalindrome(str1) && isPalindrome(str2) && isPalindrome(inputS)) {
		System.out.println("Yes");
	}else {
		System.out.println("No");
	}

}

public static boolean isPalindrome(String sentence) {
    int minIdx = 0;
    int maxIdx = sentence.length() - 1;

    while(minIdx < maxIdx) {
        if(sentence.charAt(minIdx++) != sentence.charAt(maxIdx--)) {
            return false;
        }
    }
    return true;
}
}
