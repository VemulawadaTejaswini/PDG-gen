import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] N = new int[30];
    Arrays.fill(N, 0);
    String h = null;

    int l = 0;
    while(sc.hasNextLine()){
      h = sc.nextLine();
      String[] hl = h.split(" ");
      for(String i:hl){
        if(N[Integer.parseInt(i)]==0){
          N[Integer.parseInt(i)] = 1;
        }else{
          N[Integer.parseInt(i)] += 1;
        }
        l++;
      }

    }
    List<Integer> X = new ArrayList<>();
    for(int ans:N){
      System.out.println(ans);
    }
    
    for(int i=0;i<30;i++)if(N[i]==l)X.add(i);
    System.out.print(X);
  }
}
