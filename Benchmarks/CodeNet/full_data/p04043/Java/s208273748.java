import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int[] num = new int[3];
	String output = "NO";
	for(int i=0;i<=2;i++){
        num[i] = Integer.parseInt(sc.next());
    }
	if(num[0]==7&&num[1]==5&&num[2]==5||num[0]==5&&num[1]==7&&num[2]==5||num[0]==5&&num[1]==5&&num[2]==7){
	    output = "YES";
    }
	System.out.println(output);
    }
}
