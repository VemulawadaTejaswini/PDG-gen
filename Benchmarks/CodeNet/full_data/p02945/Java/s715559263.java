import java.util.*;
class Main{
	  public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int one = 0;
	    int two = 0;
	    int three = 0;
	    int max = 0;
	    
	    one = a + b;
	    max = one;
	    
	    two = a - b;
	    if(max < two) {
	    	max = two;
	    }
	    
	    three = a * b;
	    if(max < three) {
	    	max = three;
	    }
	    System.out.println(max);
	    
	    
	  }
	  }