import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i=0;i<n;i++)
    {
      x[i] = input.nextInt();
      y[i] = input.nextInt();
    }
    float sum = 0.0f;
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        sum+=(2.0*dist(x,y,i,j))/(float)n;
        }   
      
    }
    System.out.printf("%.10f\n",sum);
  }
   public static float dist(int[] x,int[] y,int i,int j)
   {
     double a = (double)(x[i]-x[j]);
     double b = (double)(y[i]-y[j]);
     
     return (float)Math.pow((a*a+b*b),0.5);
   }
}