import java.util.*;
public class Main{
  public static void main(String[] args){
    long count = 0l;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();
    double x[][] = new double[n][d];
    for(int i = 0;i<n;i++){
      for(int j = 0;j<d;j++){
        x[i][j] = sc.nextDouble();
      }
    }
    for(int i = 0;i<n-1;i++){
      for(int j = i+1;j<n;j++){
        double nijou = 0;
        for(int k = 0;k<d;k++){
          nijou += (x[i][k]-x[j][k])*(x[i][k]-x[j][k]);
        }
        double ruuto = Math.sqrt(nijou);
        if(seisuu(ruuto))count++;
      }
    }
    System.out.println(count);
  }

  public static boolean seisuu(double x){
    double check = x - (double)(int)x;
    boolean a = false;
    if(check == 0.0)a=true;
    return a;
  }
}
