import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String M[] ={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    String N =sc.next();
    for(int A=0;A<25;A++){
      if(N.equals(M[A])){System.out.println(M[A+1]);System.exit(0);}}
  }
}