import java.util.*;
class Main{
   static Integer[]cache;
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int []x=new int[n];
    cache=new Integer[n];
    for(int i=0;i<n;i++){
      x[i]=sc.nextInt();
    }
    System.out.println(ans1(x,0,k));
  }
 
    public static int ans1(int []h,int index,int k){
        if(index==h.length-1) return 0;
        if(cache[index]!=null) return cache[index];
        int current=Integer.MAX_VALUE;
        for(int i=1;i<=k;i++){
            if(index+i<h.length) {
                current = Math.min(current, Math.abs(h[index] - h[index + i]) + ans1(h, index + i, k));
            }
        }
 
        return cache[index]=current;
    }
 
}