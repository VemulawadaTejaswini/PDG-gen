import java.util.*;

class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);

	int n = stdIn.nextInt();
	String s = stdIn.next();

	char[] c = new char[n];
	for(int i = 0;i < n;i++){
	    c[i] = s.charAt(i);
	}

	int a = 0;
	for(int i = 0;i < n;i++){
	    if(c[i] == ')')
		a++;
	    else
		a--;
	}
	
	if(a < 0){
	    for(int i = 0;i < a * -1;i++){
		s += ")";
	    }
	}
	else if(a > 0){
	    for(int i = 0;i < a;i++){
		s = "(" + s;
	    }
	}
	else{
	    for(int i = 0;i < n;i++){
		if(c[i] == ')')
		    s = '(' + s;
		else
		    s += ')';
	    }
	}
	System.out.println(s);
	    
    }
}
