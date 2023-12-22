import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long maxsum=0;
        long minsum=0;
        int mod=1000000007;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        Mods m=new Mods(n+1,mod);
        for(int i=0;i<n;i++){
            maxsum=((((long)m.modNCR(i,k-1)*(long)a[i])%mod+mod)%mod+maxsum)%mod;
            minsum=((((long)m.modNCR(n-i-1,k-1)*(long)a[i])%mod+mod)%mod+minsum)%mod;
        }
        System.out.println(((maxsum-minsum)+mod)%mod);
 
    }


}
class Mods {
    private int mod;
    private int[] fact;
    //modは十分大きい素数にすること!
    public Mods(int len,int mod){
        fact=new int[len+1];
        fact[0]=fact[1]=1;
        this.mod=mod;
        for(int i=2;i<=len;i++){
            fact[i]=modMult(fact[i-1],i);
        }
    }
    int modSum(int a,int b){
        return (int)(((long)a+(long)b)%mod);
    }
    int modMult(int a,int b){
        return (int)((((long)a*(long)b)%mod+mod)%mod);
    }
    private int pow2(int a,int times){
        if(times==0)return a;
        else return pow2((int)((long)a*(long)a%mod),times-1);
    }
    int modPow(int a,int b){
        int output=1;
        if(b==0)return 1;
        for(int i=0;i<Math.log(b)/Math.log(2)+1;i++){
            if((b&(int)Math.pow(2, i))>0){
                output=modMult(pow2(a,i),output);
            }
        }
        return output;
    }
    int modDivide(int a,int b){
        return modMult(a,modPow(b,mod-2));
    }
    int modNCR(int n,int r){
        if(n<r)return 0;
        if(n==r)return 1;
        return modDivide(modDivide(fact[n],fact[r]),fact[n-r]);
    }
}