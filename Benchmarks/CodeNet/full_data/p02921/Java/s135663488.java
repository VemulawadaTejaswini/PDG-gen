import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String[] S=scan.nextLine().split("");
    String[] T=scan.nextLine().split("");
    int count=0;
    for(int i=0;i<3;i++){
      if(S[i].equals(T[i])){
        count++;
      }
    }
    System.out.println(count);
  }
}