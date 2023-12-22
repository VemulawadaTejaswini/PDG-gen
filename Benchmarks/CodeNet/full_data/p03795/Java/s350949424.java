import java.util.*;

public class Main{
	
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
  	int n=sc.nextInt(),x=0,y=0;
    for(int i=1;i<n;i++){
      x+=800;
      if(i%15==0){
        y+=200;
      }
    }
    System.out.println(x-y);
  }
}
