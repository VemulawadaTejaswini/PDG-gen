import java.util.*;
import java.io.*;
class Main{
    private static class T{
        int l,r,d;
        public T(int l,int r,int d){
            this.l=l;
            this.r=r;
            this.d=d;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hs=new HashMap<>();
        ArrayDeque<T> ar=new ArrayDeque<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int l=0,r=0,d=0;
        boolean f=true;
        for(int i=0;i<m;i++){
            l=sc.nextInt();
            r=sc.nextInt();
            d=sc.nextInt();
            ar.addLast(new T(l,r,d));
        }
        int i=0,L=ar.size();
        int cycles=0;
        while(ar.size()!=0 && cycles<L*L){
            cycles++;
            T first=ar.removeFirst();
            l=first.l;
            r=first.r;
            d=first.d;
            if(i==0){
                hs.put(l,0);
                hs.put(r,d);
                i++;
            }
            else if(!hs.containsKey(l) && !hs.containsKey(r)){
                ar.addLast(first);
            }
            else if((hs.containsKey(l) && !hs.containsKey(r))||(hs.containsKey(r) && !hs.containsKey(l))){
                int known=(hs.containsKey(l))?l:r;
                int unknown=(!hs.containsKey(l))?l:r;
                if(r==known) hs.put(l,hs.get(r)-d);
                else hs.put(r,hs.get(l)+d);
            }
            else if(hs.containsKey(l) && hs.containsKey(r)){
                if(d!=hs.get(r)-hs.get(l))
                    f=false;
            }
        } // while of ar
        if(f)
            System.out.println("Yes");
        else System.out.println("No");
    }
}