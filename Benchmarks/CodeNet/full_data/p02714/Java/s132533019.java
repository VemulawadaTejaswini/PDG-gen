import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    ArrayList<Integer> r = new ArrayList<Integer>();
    ArrayList<Integer> g = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();
    for(int i = 0;i<n;i++){
      String moji = s.substring(i,i+1);
      if(moji.equals("R")){
        r.add(i);
      }else if(moji.equals("G")){
        g.add(i);
      }else{
        b.add(i);
      }
    }
    int count = 0;
    for(int i = 0;i<r.size();i++){
      for(int j = 0;j<g.size();j++){
        for(int k = 0;k<b.size();k++){
          ArrayList<Integer> list = new ArrayList<Integer>();
          list.add(r.get(i));
          list.add(g.get(j));
          list.add(b.get(k));
          Collections.sort(list);
          if(2 * list.get(1) != list.get(0) + list.get(2)){//ここに条件
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
