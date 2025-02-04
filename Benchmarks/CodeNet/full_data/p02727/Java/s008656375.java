import java.util.*;

public class Main {
    public static class data implements Comparable<data>{
        long value;
        int from;
        
        void data(long a,int b){
            this.value=a;
            this.from=b;
        }
        
        public int compareTo(data d){
            return (d.value-this.value>0)?1:(-1);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        data[] p=new data[A];
        data[] q=new data[B];
        data[] r=new data[C];
        
        for(int i=0;i<A;i++){
            data tmp=new data();
            tmp.data(sc.nextLong(),0);
            p[i]=tmp;
        }
        
        for(int i=0;i<B;i++){
            data tmp=new data();
            tmp.data(sc.nextLong(),1);
            q[i]=tmp;
        }
        
        
        for(int i=0;i<C;i++){
            data tmp=new data();
            tmp.data(sc.nextLong(),2);
            r[i]=tmp;
        }
        
        Arrays.sort(r);
        int idx=0;
        
        data[] pr=new data[A+C];
        
        for(int i=0;i<A;i++){
            pr[i]=p[i];
        }
        for(int i=0;i<C;i++){
            pr[A+i]=r[i];
        }
        
        Arrays.sort(pr);
        long ans=0L;
        
        for(int i=0;i<X;i++){
            long tmp=pr[i].value;
            ans+=tmp;
            if(pr[i].from==2){
                r[idx].value=-1;
                idx++;
            }
        }
        
        data[] qr=new data[B+C];
        
        for(int i=0;i<B;i++){
            qr[i]=q[i];
        }
        
        for(int i=0;i<C;i++){
            qr[i+B]=r[i];
        }
        
        Arrays.sort(qr);
        
        for(int i=0;i<Y;i++){
            long tmp=qr[i].value;
            ans+=tmp;
        }
        
        
        System.out.println(ans);
    }
}
