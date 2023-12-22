import java.util.*;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long L = sc.nextLong();
      long N = sc.nextLong();
      long currentPos = 0;
      long totalDistance = 0;
      ArrayList<Long> X = new ArrayList<>();
      for(long i=0;i<N;i++){
        X.add(sc.nextLong());
      }
      
      while(X.size() > 0){
        long lastX = X.get(X.size()-1);
        long firstX = X.get(0);
        //System.out.println("l"+lastX+"f"+firstX);
        long leftTurn = lastX > currentPos ? currentPos + (L - lastX) : currentPos - lastX;
        long rightTurn = firstX > currentPos ? firstX - currentPos : L - currentPos + firstX;
        //System.out.println("L"+leftTurn+"R"+rightTurn);
        
        if(leftTurn >= rightTurn){
          totalDistance +=  leftTurn;
          currentPos = lastX;
          //System.out.println("Re"+(X.size()-1)+"pos"+currentPos);
          X.remove(X.size()-1);      
        } else {
          totalDistance +=  rightTurn;
          currentPos = firstX;
          //System.out.println("Re"+0+"pos"+currentPos);
           X.remove(0);
        }
  
      }
      
                                      
      System.out.print(totalDistance);
      		      
	}
}