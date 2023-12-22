import java.util.*;

public class Main{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String a[] ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
    for(int i=0; i<7; i++){
	if(a[i].equals(S)){
	    System.out.println(7-i);
	}
    }
    }
}
