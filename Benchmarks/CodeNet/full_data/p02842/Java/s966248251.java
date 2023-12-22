import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();

    double b = a/1.08;
    double c = (a+1)/1.08;
    int d = (int)b;
    int e = d+1;

    if(e*1.08 == a){
      System.out.println(e);        
    }

    else{
      System.out.println(":(");
    }
  }
}
