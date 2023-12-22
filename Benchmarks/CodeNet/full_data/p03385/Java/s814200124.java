import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    int[] cntChar = new int[3];
    for(int i = 0; i < 3; i++){
      switch(S.charAt(i)){
        case 'a':
          cntChar[0] += 1;
          break;
        case 'b':
          cntChar[1] += 1;
          break;
        case 'c':
         cntChar[2] += 1;
         break;
        default:
          break;
      }
    }

    if(cntChar[0] < 1 || cntChar[1] < 1 || cntChar[2] < 1){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
