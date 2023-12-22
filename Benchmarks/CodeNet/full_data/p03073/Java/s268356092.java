import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	String s = scan.next();

	int oddZero = 0;
	int oddOne = 0;
	int evenZero = 0;
	int evenOne = 0;
	for(int i = 0; i < s.length(); i++){
	    if(i % 2 == 0){  //1,3,5など奇数番目
		if(s.charAt(i) == '0'){
		    oddZero++;
		}else{
		    oddOne++;
		}
	    }else{  //2,4,6など偶数番目
		if(s.charAt(i) == '0'){
		    evenZero++;
		}else{
		    evenOne++;
		}
	    }
	}

	/*
	System.out.println("EZ : "+evenZero);
	System.out.println("EO : "+evenOne);
	System.out.println("OZ : "+oddZero);
	System.out.println("OO : "+oddOne);
	*/

	if(evenZero + oddOne > evenOne + oddZero){
	    System.out.println(evenOne+oddZero);
	}else if(evenOne + oddZero > evenZero + oddOne){
	    System.out.println(evenZero+oddOne);
	}else{
	    System.out.println(s.length()/2);
	}
    }
}
	
