import java.util.*;
class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next().replace("C","A").replace("G","A").replace("T","A");
	int len = s.length();
	int max = 0;
	for(int i = len; i>=0; i--) {
	    String str = "";
	    for(int j = 0; j<i;j++) {
		str = str + "A";
	    }
	    if(s.indexOf(str)>=0) {
		System.out.println(i);
		return;
	    }
	}



    }
}