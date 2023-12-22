import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    char[]ss = S.toCharArray();

    int nedan = 700;
    for(int i=0; i<3; i++){
    if(ss[i]=='o'){
        nedan += 100;
    }
}
	System.out.println(nedan);    
    }
}