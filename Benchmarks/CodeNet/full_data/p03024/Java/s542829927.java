import java.util.*;

public class Main {
  public static void main(final String[] args){
    final Scanner s = new Scanner(System.in);
    final String line = s.nextLine();
    final int nokori = 15 - line.length();
    int counter = 0;
    
    for(int i = 0;i<line.length();i++){
      if(line.charAt(i) == 'o'){
        counter++;
      }
    }
    
    if(counter + nokori >= 8){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
