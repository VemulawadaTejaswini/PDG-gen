import java.util.*;

class Main{
    public static void main(String[] arg){
      Scanner sc = new Scanner(System.in);
      String S = sc.nextLine();
      char[] list = S.toCharArray();
      String index = "";String ans = "";
      char B = 'B';
      for(int i = 0;i < S.length(); i++){
        if(i != 0){
          if(list[i] == B){
            list[i] = 'B';
            list[i-1] = 'B';
          }
        }
      }
      for(char v:list){
        ans += v;
      }
      System.out.println(ans.replace("B",""));
    }
}
