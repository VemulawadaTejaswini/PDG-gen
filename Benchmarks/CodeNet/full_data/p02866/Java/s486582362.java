import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++)nums[i]=sc.nextInt();
    Arrays.sort(nums);
    int tmp=0;
    int index=0;
    int count=0;
    int[] counts=new int[100000];
    int ans=1;
    int mod=998244353;
    Mods m=new Mods(100000,mod);
    do{
      if(tmp==nums[index]){
        count++;
        if(tmp==0&&count>1){
          System.out.println(0);return;
        }
      }else{
        counts[tmp]=count;
        count=0;
        if(tmp>0)ans=m.modMult(ans,m.modNCR(counts[tmp-1]+counts[tmp]-1,counts[tmp]));
        tmp++;
      }
      index++;
    }while(index<n);
    System.out.println(ans);
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
            fact[i]=(int)((long)fact[i-1]*i)%mod;
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