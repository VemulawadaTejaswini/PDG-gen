import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int manth = Integer.parseInt(sc.next());
    int day = Integer.parseInt(sc.next());
    int takahasi = 0;
    
    for(int i = 1;i <= manth;i++){
      for(int j =  1;j <= day;j++){
        if(i == j){
          takahasi++;
        }
      }
    }
    
    System.out.println(takahasi);
  }
}