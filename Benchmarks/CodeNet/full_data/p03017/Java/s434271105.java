import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    String S = sc.next();
    //C<Dならば、ふぬけが先に動いて到達できるか、そのあとすぬけが到達できるかを考えればよい

    if(C<D){
      if(!isDoubleStone(S,B,D)&&!isDoubleStone(S,A,C)){
        System.out.println("Yes");
        return;
      }else{
        System.out.println("No");
        return;
      }
    }
      
    //C>Dならば、BからDの間で、ふぬけがすぬけに追い越させる隙間が必要
    if(C>D){
      if(!isTripleSpace(S,B,D)){
        System.out.println("No");
        return;
      }
      //隙間があるならあとは到達できるかを独立して考える
      if(!isDoubleStone(S,B,D)&&!isDoubleStone(S,A,C)){
        System.out.println("Yes");
        return;
      }else{
        System.out.println("No");
        return;
      }
    }
  }
  //nからmの間に2連続で石が置いてあるか確認するメソッド
  public static boolean isDoubleStone(String S,int n,int m){
    for(int i=n-1;i<m-1;i++){
      if(S.substring(i,i+2).equals("##")){
        return true;
      }
    }
    return false;
  }
  
  //nからmの間に3連続で隙間が空いているか確認するメソッド
  public static boolean isTripleSpace(String S,int n,int m){
    for(int i=n-1;i<Math.min(m-1,S.length());i++){
      if(S.substring(i,i+3).equals("...")){
        return true;
      }
    }
    return false;
  }
  

  
}