import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int n = sc.nextInt();
      int[] a=new int[n];
      int[] b = new int[n];
      int sum=0,flag=0;
      
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        b[i]=sc.nextInt();
      }

       for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          if(b[j]<b[i]){
            int tmp=b[j];
            b[j]=b[i];
            b[i]=tmp;
            tmp=a[j];
            a[j]=a[i];
            a[i]=tmp;
          } 
        }
      }
      
        for(int i=0;i<n;i++){
          sum+=a[i];
        
          if(sum>b[i]) flag++;
      }
      System.out.print(flag>0?"No":"Yes");
    }

}
