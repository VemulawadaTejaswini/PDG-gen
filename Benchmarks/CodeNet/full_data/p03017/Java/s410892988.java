import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    String str = sc.nextLine();
    Try try1 = new Try(A,C,str);
    Try try2 = new Try(B,D,str);
    System.out.println("YES");
  }
}
public class Try{
  int start;
  int end;
  String str2;
  public Try(int start,int end,String str2){
    for(int i = start; i <= end; i++){
      if(i==end){
        break;
      }
      if(str.charAt(i+2)=='.'){
        i=i+2;
      }else{
        if(str.charAt(i+1)=='.'){
          i++;
        }else{
          System.out.println("NO");
          break;
        }
      }
  }
}
