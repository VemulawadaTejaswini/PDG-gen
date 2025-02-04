import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    List<Integer> red = new ArrayList<>();
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0]);
      int b = Integer.parseInt(S[1]);
      int n = a * 1000 + b;
      red.add(n);
    }
    List<Integer> blue = new ArrayList<>();
    for(int i = 0; i < N; i++){
      String[] S = sc.nextLine().split(" ");
      int a = Integer.parseInt(S[0]);
      int b = Integer.parseInt(S[1]);
      int n = a * 1000 + b;
      blue.add(n);
    }
    Collections.sort(red);
    Collections.sort(blue);
    
    for(int i = 0; i < blue.size(); i++){
      for(int j = 0; j < red.size(); j++){
        if(blue.get(i) > red.get(i)){
          blue.remove(i);
          red.remove(i);
          i--;
          break;
        }
      }
    }
    System.out.println(N-blue.size());
  }
}