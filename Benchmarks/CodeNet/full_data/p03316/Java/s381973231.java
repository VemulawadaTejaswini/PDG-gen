import java.util.*;
    public class Main{
	public static void main(String[] args){
	    Scanner scan = new Scanner(System.in);
	    String numM = scan.next();
	    int origin = Integer.parseInt(numM);
	    int startNum = 0;
		
	    for(int i =0;i<numM.length();i++){
		startNum= startNum+Integer.parseInt(String.valueOf(numM.charAt(i)));
	
	    }
	    if(origin%startNum==0){
		System.out.println("Yes");
	    }else{
		System.out.println("No");
	    }
	}
    }
