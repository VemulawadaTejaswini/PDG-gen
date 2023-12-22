import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	int N = stdIn.nextInt();
	String result = "No";
	for(int i=1;i<10;i++){
	    for(int j=1;j<10;j++){
		if(i*j==N){
		    result="Yes";
		    break;
		}
	    }
	}
	System.out.println(result);
    }
}
