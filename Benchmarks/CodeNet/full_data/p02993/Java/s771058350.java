import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
        String S = stdIn.next();
	char[] c = new char[4];
	int flag =0;
	for(int i=0;i<3;i++){
	    if(S.charAt(i)==S.charAt(i+1)){
		flag++;
	        System.out.println("Bad");
		break;
	    }
	}
	if(flag==0){
	    System.out.println("Good");
	}   
    }
}
