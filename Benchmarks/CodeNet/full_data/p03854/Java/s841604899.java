//if文ばかり(;_;)

import java.util.*;

public class Main{

    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	String s = sc.next();
	String t = "";

	String d1 = "dream";
	String d2 = "dreamer";
	String e1 = "erase";
	String e2 = "eraser";

	int x = 0;
	int l = s.length();

	while(x<l){

	    
	    if(s.charAt(x) == 'd'){// dream or dreamer
		if(x+7 == l){
		    t = t + d2;
		    break;
		}

		if(x + 5 == l){
		    t = t + d1;
		    break;
		}
		if(x+5>l){break;}
		if(s.charAt(x+5)=='d' || s.charAt(x+7) == 'a'){
		    t = t + d1;//dream
		    x = x + 5;
       
		}else{
		    if(x+7>l)break;
		    t = t + d2;
		    x = x + 7;//dreamer
		}
		
	    }else if(s.charAt(x) == 'e'){ //erase or eraser
        
		if(x+6== l ){
		    t = t + e2;
		    break;
		}

		if(x + 5 == l){
		    t = t + e1;
		    break;
		}

		if(x+6>l)break;
		if(s.charAt(x+6) == 'e' || s.charAt(x+6) == 'd'){//eraser
		    t = t + e2;
		    x = x + 6;
		}else{
		    t = t + e1;
		    x = x + 5;
		}
	    }else{
		break;
	    }
	}


	if(s.equals(t)){
	    System.out.println("YES");
	}else{
	    System.out.println("NO");
	}
	
    }
}
