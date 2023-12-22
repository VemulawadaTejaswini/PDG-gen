import java.util.*;

class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    
    int[] ai = new int[a];
    int[] bi = new int[b];
    
    for(int i=0;i<a;i++)
      ai[i] = sc.nextInt();
    
    for(int i=0;i<b;i++)
      bi[i] = sc.nextInt();
    int[] c  = new int[m];
    int[] x  = new int[m];
    int[] y  = new int[m];
    
    for(int i=0;i<m;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    
    int ans = 1000000000;
    int tmp;
    
    for(int p=0;p<a;p++){
      for(int q=0;q<b;q++){
        tmp = ai[p] + bi[q];
        if(tmp<ans)
          ans = tmp;
      }
    }
    
    for(int k=0;k<m;k++){
      tmp = ai[x[k]-1] + bi[y[k]-1] -c[k];
      if(tmp<ans)
        ans = tmp;
    }
    
    
    System.out.print(ans);
  }
}