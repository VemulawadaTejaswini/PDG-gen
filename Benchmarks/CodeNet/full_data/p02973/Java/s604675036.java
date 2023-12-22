import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Integer> list = new ArrayList<>();
    int n = 0;
    for(int i = 0; i < N; i++){
      int a = Integer.parseInt(sc.nextLine());
      if(n < a){
        n = a;
      }else{
	    list.add(a);
      }
    }
    
    int count = 1;
    while(list.size() > 0){
      int a = list.get(0);
      list.remove(0);
      
      for(int i = 0; i < list.size(); i++){
        int b = list.get(i);
        if(a < b){
          a = b;
          list.remove(i);
          i--;
        }
      }
      count++;
    }
    System.out.println(count);
  }
}