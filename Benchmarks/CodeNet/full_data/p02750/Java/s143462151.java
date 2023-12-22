import java.util.*;

public class Main {
    static class Pair{
        int a,b,index;
        public Pair(int a,int b,int i)
        {
            this.a=a;
            this.b=b;
            this.index=i;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int T=sc.nextInt();
        int t=1;
        Pair[] pairs=new Pair[n];
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            pairs[i]=new Pair(a,b,i);
        }
        int count=0;
        HashSet<Integer>set=new HashSet<>();
        while(t<T+0.5)
        {
            count++;
            int finalT = t;
            Arrays.sort(pairs, new Comparator<Pair>() {
                @Override
                public int compare(Pair pair1, Pair pair2) {
                    return (int) ((long)(pair1.a* finalT +pair1.b)-(long)(pair2.a* finalT +pair2.b));
                }
            });
            int i=0;
            for(i=0;i<n;i++){
                if(!set.contains(pairs[i].index)){
                    set.add(pairs[i].index);
                    break;
                }
            }
            if(i<n)t+=pairs[i].a*t+pairs[i].b+1;
            if(count==n)break;
        }
        System.out.println(count);
    }
}
