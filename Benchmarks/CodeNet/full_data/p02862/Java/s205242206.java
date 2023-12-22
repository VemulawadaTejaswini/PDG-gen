import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
      	int y = Integer.parseInt(sc.next());
      	int k = (x+y)/3;
      	int ans = 0;
      	if((x+y)%3==0 && x-k>=0 && y-k>=0){
          ans = modCombination(x+y-2*k,x-k,1000000007);
        }
      	System.out.print(ans);
        System.out.flush();
    }
    public static int modCombination(int n , int k , int div){
        long fact = 1;
        long inverse = 1;
        for(int i=n;i>=n-k+1;i--){
            fact = (fact*i)%div;
            inverse = (inverse*(i-n+k))%div;
        }

        return (int)((fact*pow(inverse,div-2,div))%div);
    }
    //xのn乗をmodで割ったあまりを返す
    public static long pow(long x,int n,int div){
        long ans = 1;
        while(n>0){
            if((n & 1)==1){
                ans = (ans*x)%div;
            }
            x = (x*x)%div;
            n>>=1;
        }
        return ans;
    }
}