import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long W = sc.nextLong(); 
    Long H = sc.nextLong(); 
    Long x = sc.nextLong(); 
    Long y = sc.nextLong(); 
    int b = 0;
    if((Double)W/2==(Double)x&&H/2==y){
      b = 1;
    }
    Double ans = (Double)W*H/2;

    System.out.println(ans+" "+1);
  
  }
}

