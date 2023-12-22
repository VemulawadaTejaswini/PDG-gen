import java.util.Scanner;
class Main{
   public static void main(String[] args){
      int n=1;
      Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      while(true){
         if(n*n-n>2*N){
             System.out.println("No");
             break;
        }else if(n*n-n==2*N){
             int Arr[]=new int[N];
             for(int a=0;a<N;a++){
                 Arr[a]=0;
            }System.out.println("Yes");
             System.out.println(n);
             for(int i=1;i<=n;i++){
                 int b=0;int c=0;               
                 System.out.print(n-1+" ");
                 for(int j=0;j<n;j++){
                     if(Arr[j]==1&&b<i-1){                               
                          System.out.print(j+1+" ");
                          Arr[j]=2;
                          b++;
                    }else if(Arr[j]==0&&c<n-i){
                          System.out.print(j+1+" ");
                          Arr[j]=1;
                          c++;
                    }
                 }System.out.println(" ");
            }break;
        }n++;
     }
  }
}