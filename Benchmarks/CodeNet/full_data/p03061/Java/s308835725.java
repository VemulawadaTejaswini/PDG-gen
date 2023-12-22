import java.util.*;

public class Main{
  static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] array = new int[n];

    for(int i=0; i<n; i++){
      array[i] = sc.nextInt();
    }

    int a = array[0];
    int b = array[n-1];
    int ans =0;
    int max_ans = 0;
    int pp;
    int ss;
    int tt;
    int uu;

    for(int i=0; i<n; i++){
      pp =array[0];
      ss =array[n-1];
      tt =0;
      uu =0;
      if(i==0){
         tt = array[1];
         for(int j=2; j<n; j++){
           tt = gcd(tt,array[j]);
         }
         ans = tt;
       }else if(i>0 && i<n-1){
         for(int j=1; j<i; j++){//左側のgcd
           pp = gcd(pp,array[j]);
         }
         for(int j=n-2; j>i; j--){//右側のgcd
           ss = gcd(ss,array[j]);
         }
         ans = gcd(pp,ss);

       }else if(i==n-1){
         uu = array[0];
         for(int j=1; j<n-1; j++){
           uu = gcd(uu,array[j]);
         }
         ans = uu;
       }

       if(ans>max_ans){
         max_ans = ans;
       }



    }
    System.out.println(max_ans);
  }
}