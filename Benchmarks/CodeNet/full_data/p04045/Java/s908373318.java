import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int price = sc.nextInt();
    int ngnum = sc.nextInt();
    String[] ng = new String[ngnum];
    for(int i = 0; i < ngnum; i++){
      ng[i] = sc.next();
    }
    boolean isOk = true;
    for(int i = price; i < 10001; i++){
      for(int j = 0; j < ngnum; j++){
        if(Integer.toString(i).contains(ng[j])){
          isOk  = false;
          break;
        }
      }
 	if(isOk){
      System.out.println(i);
      return;
    }
 	isOk = true;
    }
  }
}
      