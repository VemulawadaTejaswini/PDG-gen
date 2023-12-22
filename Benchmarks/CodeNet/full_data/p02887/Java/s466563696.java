import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); sc.nextLine();
    String S = sc.nextLine();
    String[] Sarray = S.split("");
    String before = "";
    int ans = 0;
    for (int i=0;i<N;i++){
      if (!before.equals(Sarray[i])){
        ans++;
      }
      before = Sarray[i];
    }
    System.out.println(ans);
  }
}