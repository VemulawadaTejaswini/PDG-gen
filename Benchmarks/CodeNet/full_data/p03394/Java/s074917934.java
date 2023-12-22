import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N==3){
        	System.out.println("2 5 63");
        	System.exit(0);
        }
        
        
        System.out.print("2 3");
        int elmNum=2;
        int elm = 4;
        int sum=5;
        
        while(elmNum<N-2){
        	if(elm%2==0 || elm%3==0){
        	    System.out.print(" "+elm);
        	    elmNum++;
        	    sum+=elm;
        	}
        	elm++;
        }
        //2 elements left
        switch(sum%6){
        	case 0:
        	    System.out.println(" 29994 30000");
        	    break;
        	case 1:
        	    System.out.println(" 29996 29997");
        	    break;
        	case 2:
        	    System.out.println(" 29998 30000");
        	    break;
        	case 3:
        	    System.out.println(" 29997 30000");
        	    break;
        	case 4:
        	    System.out.println(" 29996 30000");
        	    break;
        	case 5:
        	    System.out.println(" 29997 29998");
        	    break;
        }
        
        System.out.println();
    }
}