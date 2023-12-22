import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[]ss = S.toCharArray();
        ArrayList<Character>a = new ArrayList<>();

        for(int i=0; i<S.length(); i++) {
        	if(!a.contains(ss[i])){		
        	      a.add(ss[i]);		
        	}
        }
        if(a.size()==S.length()){
            System.out.println("yes");    
        }else{
            System.out.println("no");
    }
}
}
