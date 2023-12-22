import java.util.*;
public class Main{
    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);


	while(sc.hasNext()){
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int x = a*b;
	    
	    if(x%2 == 0){
		System.out.println("Even");
	    }else{
		System.out.println("Odd");
	    }
	}
    }
}
