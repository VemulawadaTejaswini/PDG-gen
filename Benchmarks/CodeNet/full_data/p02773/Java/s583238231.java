import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    HashMap<String, Integer> a= new HashMap<String,Integer>();
    ArrayList<String> g = new ArrayList<String>();
    for (int i=0;i<n;i++){
      String t = scan.next();
      if (a.put(t,1) == null){
        g.add(t);
      }
      else{
        int m = a.put(t,1);
        a.put(t,m+1);
      }
    }
    ArrayList<String> d = new ArrayList<String>();
    int max = 0;
    for (int j=0;j<g.size();j++){
      if (a.get(g.get(j)) > max){
        d = new ArrayList<String>();
        d.add(g.get(j));
        max = a.get(g.get(j));
        continue;
      }
      if (a.get(g.get(j)) == max){
        d.add(g.get(j));
      }
    }
    String str[] = new String[d.size()];
    for (int nn=0;nn<d.size();nn++){
      str[nn] = d.get(nn);
    }

    for (int p=0;p<d.size();p++){
      for (int o = p + 1; o < d.size(); o++) {
        if (str[p].compareTo(str[o])>0){
            String tempo = str[p];
            str[p] = str[o];
            str[o] = tempo;
        }
      }
    }

    for (int m=0;m<d.size();m++){
      System.out.println(str[m]);
    }

  }
}
