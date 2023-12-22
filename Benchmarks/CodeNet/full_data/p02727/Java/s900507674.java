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
            return (d.value-this.value>=0)?1:(-1);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        Long[] p=new Long[A];
        Long[] q=new Long[B];
        Long[] r=new Long[C];
        
        for(int i=0;i<A;i++){
            p[i]=sc.nextLong();
        }
        
        for(int i=0;i<B;i++){
            q[i]=sc.nextLong();
        }
        
        
        for(int i=0;i<C;i++){
            r[i]=sc.nextLong();
        }
        
        Arrays.sort(p,Collections.reverseOrder());
        Arrays.sort(q,Collections.reverseOrder());
        Arrays.sort(r,Collections.reverseOrder());
        
        int idxP=A-1;
        int idxQ=B-1;
        
        long ans=0L;
        
        for(int i=0;i<X;i++){
            ans+=p[i];
        }
        
        for(int i=0;i<Y;i++){
            ans+=q[i];
        }
        
        for(int i=0;i<C;i++){
            if(idxQ>-1&&idxP>-1&&r[i]>p[idxP]&&p[idxP]<q[idxQ]){
                ans+=r[i]-p[idxP];
                idxP--;
            }
            if(idxQ>-1&&idxP>-1&&r[i]>p[idxP]&&p[idxP]>=q[idxQ]){
                ans+=r[i]-q[idxQ];
                idxQ--;
            }
        }
        
        System.out.println(ans);
    }
}
