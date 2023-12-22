import java.util.*;
public class Main {
    static class N{
        long a,b,c;
        N(long x,long y,long z){
            a=x;b=y;c=z;
        }
        public String toString(){ 
            return (a+" "+b+" "+c);}
        public boolean equals(Object o){
            N n = (N)o;
            return this.a==n.a && this.b==n.b && this.c==n.c;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();int m =sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        List<N> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();
            al.add(new N(x,y,z));
        }
        Collections.sort(al, new Comparator<N>(){
            public int compare(N n1,N n2){
                if(n1.a!=n2.a){
                    return n1.a>n2.a?1:-1;
                }
                if(n1.b!=n2.b){
                    return n1.b>n2.b?1:-1;
                }
                if(n1.c!=n2.c){
                    return n1.c>n2.c?1:-1;
                }
                return 0;
            }
        });
        
        
        for(int i=0;i<n-1;){
            if(al.get(i).a == al.get(i+1).a && al.get(i).b == al.get(i+1).b && al.get(i).c == al.get(i+1).c){
                int t = i;
                while(i<n && al.get(t).a == al.get(i).a && al.get(t).b == al.get(i).b && al.get(t).c == al.get(i).c){
                    i++;
                }
                pq.add(Math.abs(al.get(t).a+al.get(t).b+al.get(t).c));
            } else {
                int t=i;
                pq.add(Math.abs(al.get(t).a+al.get(t).b+al.get(t).c));
                i++;
            }
        }
        if(al.get(al.size()-1)!=al.get(al.size()-2)){
            pq.add(Math.abs(al.get(al.size()-1).a+al.get(al.size()-1).b+al.get(al.size()-1).c));
        }
        long ans =0l;
        for(int i=0;i<m;i++){
            ans+=pq.poll();
        }
        System.out.println(ans);
    }
}
