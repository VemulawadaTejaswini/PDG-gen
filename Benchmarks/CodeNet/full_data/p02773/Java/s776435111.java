import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    String[] str = new String[N];
    for(int i = 0; i < N; i++){
      str[i] = sc.nextLine();
    }
    Arrays.sort(str);    
    List<String> list = new ArrayList<>();
    
    int now = 1;
    int max = 1;
    String s = "";
    for(int i = 0; i < N; i++){
      String t = str[i];
      if(i == 0){
        s = t;
        list.add(s);
      }else{
        if(t.equals(s)){
          now++;
          if(i == N-1){
            if(max < now){
              list.clear();
              list.add(t);
            }else if(max == now){
              list.add(t);
            }
          }
        }else{
          if(max < now){
            max = now;
            list.clear();
            list.add(s);
          }else if(max == now){
            list.add(s);
          }
          now = 1;
          s = t;
        }
      }
    }
    Collections.sort(list);
    for(String st : list){
      System.out.println(st);
    }
  }
}