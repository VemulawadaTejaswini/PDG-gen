import java.util.*;
 
public class Main {
  public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int x = sc.nextInt();
    	int y = sc.nextInt();
	    String[] group1 = new String[]{"1","3","5","7","8","10","12"};
    	String[] group2 = new String[]{"4","6","9","11"};
    	String[] group3 = new String[]{"2"};

	    if((Arrays.asList(group1).contains(String.valueOf(x)))&&(Arrays.asList(group1).contains(String.valueOf(y)))){
	        System.out.println("Yes");
	    }else if((Arrays.asList(group2).contains(String.valueOf(x)))&&(Arrays.asList(group2).contains(String.valueOf(y)))){
	        System.out.println("Yes");
	    }else if((Arrays.asList(group3).contains(String.valueOf(x)))&&(Arrays.asList(group3).contains(String.valueOf(y)))){
	        System.out.println("Yes");
	    }else {
          	System.out.println("No");
        }
	}
 
}