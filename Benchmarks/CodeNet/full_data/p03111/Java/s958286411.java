import java.util.Scanner;

public class Main{
  static int count;
  static int N;
  static int A;
  static int B;
  static int C;
  static int Array[];
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     N = sc.nextInt();
     A = sc.nextInt();
     B = sc.nextInt();
     C = sc.nextInt();
     Array = new int[N];
     for(int i=0;i<N;i++){
       Array[i]=sc.nextInt();
     }
     count = dfs(0,0,0,0,0);
     System.out.println(count);



  }

  static int dfs(int i, int Aco, int Bco, int Cco,int co){
    if(i==N){
      if(Aco==0 || Bco==0 || Cco==0){
        return 100000000;
      }
      else
      return Math.abs(Aco-A)+Math.abs(Bco-B)+Math.abs(Cco-C)+co-30;
    }
    else{
      return minimum(dfs(i+1,Aco+Array[i],Bco,Cco,co+10),
                               dfs(i+1,Aco,Bco+Array[i],Cco,co+10),
                               dfs(i+1,Aco,Bco,Cco+Array[i],co+10),
                               dfs(i+1,Aco,Bco,Cco,co));
    }
  }

  static int minimum(int a,int b,int c,int d){
    int ans = 1999999;
    int[] Arra= new int[4];
    Arra[0] = a;
    Arra[1] = b;
    Arra[2] = c;
    Arra[3] = d;
    for(int i=0;i<4;i++){
      if(ans>=Arra[i]){
        ans = Arra[i];
      }
    }
      return ans;
    }






}