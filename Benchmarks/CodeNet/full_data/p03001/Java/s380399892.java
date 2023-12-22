import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<trip> ll;
    public static void main(String[] args){
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] ss=br.readLine().split(" ");
            long w=Long.parseLong(ss[0]);
            long h=Long.parseLong(ss[1]);
            long x=Long.parseLong(ss[2]);
            long y=Long.parseLong(ss[3]);
            double d1=((double)x)*h,d2=((double)(w-x))*h;
            double b1=((double)(y))*w,b2=((double)(h-y))*w;
            double k1=Math.min(d1,d2);
            double k2=Math.min(b1,b2);
            if(k1==k2){
                System.out.println(k1+" "+1);
            }else{
                if(k1>k2){
                    System.out.println(k1+" "+0);
                }else{
                    System.out.println(k2+" "+0);
                }
            }



        }catch(Exception e){
            System.out.println("KKKK "+e.getMessage());
        }
    }

    static class trip{
        int lev,node,child;
        public trip(int lev,int node,int child){
            this.lev=lev;
            this.node=node;
            this.child=child;
        }
    }
    static void bfs(ArrayList<ArrayList<Integer>> list){
        Queue<trip> q=new ArrayDeque<>();
        q.add(new trip(0,0,list.get(0).size()));
        boolean[] brr=new boolean[list.size()];
        brr[0]=true;
        while(q.size()>0){
            trip t=q.poll();
            if(t.child==0) {
                ll.add(t);
            }

            int node=t.node;
            for(int i=0;i<list.get(node).size();i++){
                int u=list.get(node).get(i);
                if(!brr[u]){
                    q.add(new trip(t.lev+1,u,list.get(u).size()));
                    brr[u]=true;
                }
            }
        }
    }
    static void shuffle(int[] a) {
        Random get = new Random();
        for (int i = 0; i < a.length; i++) {
            int r = get.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }
}
