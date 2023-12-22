import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    boolean result=false;
   for(int i=0;i<10;i++){
   	for(int j=0;j<10;j++){
      if(A==i*j){
      result=true;
  	 }
    }
   }
    if(result==true){
    System.out.println("Yes");
    }else{
     System.out.println("No");
    }
  }
}