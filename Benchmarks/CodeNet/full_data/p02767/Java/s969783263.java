import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int humans = sc.nextInt();
    
    int[] lives = new int[humans];
    
    for(int i=0;i<humans;i++){
      lives[i] = sc.nextInt();
    }
    
    int minPowerPoint = -1;
    int minPower = -1;
    
    for(int p = 1; p <= 100 ; p++){
      int power = 0;
      for(int live:lives){
        power += Math.pow(live-p,2);
      }
      
      if(minPowerPoint == -1 || power < minPower){
        minPowerPoint = p;
        minPower = power;
      }
    }
    System.out.println(minPower);
    
    
  }
}