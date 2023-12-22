import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int D = sc.nextInt();
    String a= "Christmas";
    if(D==24) a+= " Eve";
    if(D==23) a+= " Eve Eve";
    if(D==22) a+= " Eve Eve Eve";
    System.out.println(a);
  }
}
