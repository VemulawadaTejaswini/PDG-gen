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
            max=Math.max((long)po.get(i).a*po.get(i).b,max);
        }
        long min=0,mid=(max+min)/2;
        while(max!=min){
            long s=0;
            for(int i=0;i<n;i++){
                s+=(po.get(i).mul()<=mid)?0:Math.ceil(((double)po.get(i).mul()-mid)/po.get(i).b);
            }
            //System.out.println(max+" "+min);
            if(s>k){
                min=mid+1;
                mid=(min+max)/2;
            }else{
                max=mid;
                mid=(min+max)/2;
            }
            //System.out.println(s+" "+max);
            //System.out.println("s+"+s);
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
        return a*b;
    }
}
