import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int a = N%2;
    double b = 0;

    if(a == 0){
       b = 0.5;
    }
    else{
       b = ((1+N)/2)/N;
    }
    
    System.out.println(String.format("%.10f",b));

  }
}