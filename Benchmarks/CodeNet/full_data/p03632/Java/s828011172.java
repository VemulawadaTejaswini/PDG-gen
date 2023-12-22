import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
    if(b>=c&&d>=a){
      System.out.println((int)Math.min(Math.min(b-a,d-a),Math.min(b-c,d-c)));
    }else{
      System.out.println(0);
    }
  }
}
