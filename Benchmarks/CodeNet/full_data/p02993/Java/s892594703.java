import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    String[] s=scan.nextLine().split("");
    for(int i=0;i<s.length-1;i++){
      if(s[i].equals(s[i+1])){
        System.out.println("Bad");
        System.exit(0);
      }
    }
    System.out.println("Good");
  }
}