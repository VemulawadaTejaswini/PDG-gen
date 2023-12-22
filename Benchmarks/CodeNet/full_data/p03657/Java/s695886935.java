import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    String result = "";
    List<String> word = new ArrayList<String>();
    String w[] = new String[N];
    for(int i=0; i<N; i++){
      //word.add(sc.next());
      w[i] = sc.next();
    }
    Arrays.sort(w);
    //Collections.sort(word);
    for(String string : w){
    result += string;
    }
    System.out.println(result);
  }
}