import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int x=sc.nextInt(),t=sc.nextInt(),c=x-t;
    if(c>=0){
      System.out.println(c);
    }else{
      System.out.println(0);
    }
  }
}
