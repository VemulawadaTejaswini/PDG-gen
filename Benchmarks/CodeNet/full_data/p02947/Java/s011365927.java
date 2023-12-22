import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String [] g = new String[n];
    for (int i=0;i<n;i++){
      g[i] = scan.next();
    }
    HashMap<String,Integer> t = new HashMap<String,Integer>();
    ArrayList<String> tt = new ArrayList<String>();

    for (int j=0;j<n;j++){
        char[] gg = new char[10];
        for (int k=0;k<10;k++){
          gg[k] = g[j].charAt(k);
        }
        Arrays.sort(gg);
        String check = "";
        for (int p=0;p<10;p++){
          check += Character.toString(gg[p]);
        }
        if (t.get(check) == null){
          t.put(check,1);
          tt.add(check);
        }
        else{
          int y = t.get(check);
          t.put(check,y+1);
        }
    }


    long sum = 0;
    for (int i=0;i<tt.size();i++){
      int m = t.get(tt.get(i));
      sum += (long) m*(m-1)/2;
    }
    System.out.println(sum);

  }
}
