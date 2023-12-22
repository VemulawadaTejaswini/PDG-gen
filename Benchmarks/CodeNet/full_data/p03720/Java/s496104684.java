import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int city = sc.nextInt();
    int way = sc.nextInt();
    
    int[] cityWay = new int[city];
 
    while(sc.hasNext()){
      int wayi = sc.nextInt();
      cityWay[wayi-1] += 1;
      }
  
  for(int i = 0; i < cityWay.length; i++){
    System.out.println(cityWay[i]);
  }
  
  }  
}