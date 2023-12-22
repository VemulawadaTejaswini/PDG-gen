import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn = new Scanner(System.in);
	String b = stdIn.next();
	String[] B={"A","C","G","T"};
	String[] T={"T","G","C","A"};
	for(int i=0;i<4;i++){
	    if(b.equals(B[i])){
		System.out.println(T[i]);
	    }
	}
    }
}
