import java.util.*;

public class Main{
  public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
        
  	int a = N/100;
    int b = (N -a*100)/10;
    int c = N-a*100-b*10;
    
    if(a==7 || b==7 || c==7){
    System.out.println("yes");
    }else{
    System.out.println("no");
    }
  }
}
