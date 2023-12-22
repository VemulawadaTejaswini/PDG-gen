import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);

    	String s=sc.next();

    	int K=sc.nextInt();

    	Set<String> subs=new TreeSet<String>();

    	for(int l=1;l<=K;l++) {


    		for(int i=0;i<s.length();i++) {

    			if(i+l<=s.length()) {
    				subs.add(s.substring(i,i+l));
    			}else {
    				break;
    			}
    		}


    	}

    	int counter=1;

    	for(String str:subs) {

    		if(counter==K) {
    			System.out.println(str);
    			return ;
    		}

    		counter++;

    	}
    }


}





