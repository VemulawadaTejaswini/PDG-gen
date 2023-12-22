import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String S = sc.next();
	boolean result = false;
	int count=0;
	int cc = -1;
	for(int i=2;i<S.length()-1;i++){
	    if(S.charAt(i) == 'C'){
		result=true;
		count++;
		cc = i;
	    }
	}
	if(S.charAt(0)!='A') result=false;

	if(count != 1){
	    result = false;
	}else if(cc != -1){
	    for(int i=1;i<S.length();i++){
		if(i!=cc){
		    if(Character.isUpperCase(S.charAt(i)))
			result = false;
		}
	    }
	}
	if(result) System.out.print("AC");
	else System.out.print("WA");
    }
}
