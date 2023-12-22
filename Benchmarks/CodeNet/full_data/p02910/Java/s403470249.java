import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        
        int mojiretsu = S.length();
        
        String seikai = null;
        
        for(int i=0; i>mojiretsu; i=i+2) {
        	seikai = null;
        	if(S.substring(0, i)=="R"){
        		seikai = "Yes";
        	}else if(S.substring(0, i)=="U") {
        		seikai = "Yes";
        	}else if(S.substring(0, i)=="D") {
        		seikai = "Yes";
        	}else {
        		seikai = "No";
        	}
        }
        for(int x=0; x>mojiretsu; x=x+2) {
        	seikai = null;
         	if(S.substring(0, x)=="L"){
        		seikai = "Yes";
        	}else if(S.substring(0, x)=="U") {
        		seikai = "Yes";
        	}else if(S.substring(0, x)=="D") {
        		seikai = "Yes";
        	}else {
        		seikai = "No";
        	}
        }
  
        System.out.print(seikai);
	}

}
