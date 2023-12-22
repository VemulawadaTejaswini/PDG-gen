import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    double N = sc.nextDouble();

    double a = N%2;
    double b;

    if(a == 0){
       b = N/(2*N);
    }
    else{
       b = (N+1)/(2*N);
    }
    
    System.out.println(String.format("%.10f",b));

  }
}