import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String[] S=scan.nextLine().split("");
    int count=0;
    for(int i=0;i<S.length/2;i++){
      if(!(S[i].equals(S[S.length-1-i]))){
        count++;
      }
    }
    System.out.println(count);
  }
}