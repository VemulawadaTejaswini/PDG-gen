import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Long> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      list.add(Long.parseLong(sc.next()));
    }
    
    while(list.size() > 2){
      long min = 1000000000000l;
      int n = 0;
      
      for(int i = 1; i < list.size()-1; i++){
        if(list.get(i) < min){
          min = list.get(i);
          n = i;
        }
      }
      if(min > 2){
        break;
      }
      
      list.set(n-1, list.get(n-1)+min);
      list.set(n+1, list.get(n+1)+min);
      list.remove(n);
    }      

    while(list.size() > 2){
      long min = 1000000000000l;
      int n = 0;
      long n1 = list.get(1);
      long n2 = list.get(list.size()-2);
      if(n1 < n2){
        n = 1;
        min = n1;
      }else{
        n = list.size()-2;
        min = n2;
      }
      
      list.set(n-1, list.get(n-1)+min);
      list.set(n+1, list.get(n+1)+min);
      list.remove(n);

    }
    System.out.println(list.get(0) + list.get(1));
  }
}