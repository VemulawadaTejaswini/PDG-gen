import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();

    double a = i/1.08;
    int b = (int)a;
    double c = a-b;

    if(c>= 0.5){
    if((b+1)*1.08 == i){
      System.out.println(b);
    }
   
    else{
      System.out.println(":(");
    }

    if(c<0.5){
    if(b*1.08 == i){
    System.out.println(b);
  }
    else{
    System.out.println(":(");
    }
  }
 }
}
