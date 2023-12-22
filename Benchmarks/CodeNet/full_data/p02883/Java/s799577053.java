import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long k=sc.nextLong();
        long max=0;
        int a[]=new int[n];
        int f[]=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++)f[i]=sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(f);
        ArrayList<Po>po=new ArrayList<>();
        for(int i=0;i<n;i++){
            po.add(new Po(a[i],f[n-1-i]));
            max=Math.max(po.get(i).mul(),max);
        }
        long min=0,mid=(max+min)/2;
        while(max!=min){
            long s=0;
            for(int i=0;i<n;i++){
                int b=po.get(i).b;
                long mul=po.get(i).mul();
                s+=(mul<=mid)?0:(long)Math.ceil(((double)(mul-mid))/b);
            }
            if(s>k){
                min=mid+1;
                mid=(min+max)/2;
            }else{
                max=mid;
                mid=(min+max)/2;
            }
        }
        System.out.println(max);
    }
}
class Po{
    int a;
    int b;
    public Po(int x,int y){
        a=x;
        b=y;
    }
    public String toString(){
        return a+" "+b;
    }
    public long mul(){
        return (long)a*b;
    }
}
