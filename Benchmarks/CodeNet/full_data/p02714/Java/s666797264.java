import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int count = 0;

    int slen = s.length();
    List<Integer> r = new ArrayList<Integer>();
    List<Integer> g = new ArrayList<Integer>();
    List<Integer> b = new ArrayList<Integer>();
    for(int i = 0;i<slen;i++){
      String a = s.substring(i,i+1);
      if(a.equals("R")){
        r.add(i);
        System.out.println("r " + i);
      }else if(a.equals("G")){
        g.add(i);
        System.out.println("g " + i);
      }else{
        b.add(i);
        System.out.println("r " + i);
      }
    }
    for(int i = 0;i<r.size();i++){
      for(int j = 0;j<g.size();j++){
        for(int k = 0;k<b.size();k++){
          int nn[] = new int[3];
          nn[0] = r.get(i);
          nn[1] = g.get(j);
          nn[2] = b.get(k);
          Arrays.sort(nn);
          if(nn[1] - nn[0] != nn[2] - nn[1]){
            count++;
          }
        }
      }
    }
    System.out.println(count);
  }
}
