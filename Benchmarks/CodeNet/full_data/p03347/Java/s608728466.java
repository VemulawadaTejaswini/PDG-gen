import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] a = new int[N];
      int[] b = new int[N]; 
      int count =0;
      for(int i=0;i<N;i++){
       a[N-i-1]=sc.nextInt();
       b[i] = 0;
      }
      for(int j=0;j<N;j++){
                  if(a[j]==b[j]){continue;}
                  for(int k=0;k<a[j];k++){
                           b[j+k]=a[j]-k;
                           count++;
                  }
      }
      for(int q=1;q<N;q++){
            if(a[q]>=2&&a[q]-a[q-1]>=2){
                     count=-1;
            }else if(a[N]!=0){count=-1;}
      }
      System.out.println(count);
   }
}