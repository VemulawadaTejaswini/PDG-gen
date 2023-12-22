import java.util.*;

public class Main{
  public static int N;
  public static String[] strs;
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    N = Integer.parseInt(sc.nextLine());
    strs = new String[N];
    List<String> list = new ArrayList<>();
    for(int i = 0; i < N; i++){
      strs[i] = sc.nextLine();
      list.add(strs[i]);
    }
    Collections.sort(list);
    List<Integer> list2 = new ArrayList<>();
    String str = "";
    int a = 0;
    for(int i = 0; i < N; i++){
      String[] S = list.get(i).split(" ");
      int n = Integer.parseInt(S[1]);
      if(i == 0){
        str = S[0];
        list2.add(n);
      }else{
        if(str.equals(S[0])){
          list2.add(n);
          
        }else{
          a = list2.size();
          Collections.sort(list2, Collections.reverseOrder());
          for(int j = 0; j < a; j++){
            func(str, list2.get(j));
          }
          str = S[0];
          list2.add(n);
        }
      }
    }
    a = list2.size();
    Collections.sort(list2, Collections.reverseOrder());
    for(int j = 0; j < a; j++){
      func(str, list2.get(j));
    }
  }
  public static void func(String s, int n){
    s = s + " " + n;
    
    for(int i = 0; i < N; i++){
      if(strs[i].equals(s)){
        System.out.println(i + 1);
      }
    }
  }
}