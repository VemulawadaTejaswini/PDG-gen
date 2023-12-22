import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer>[] list=new ArrayList[n];
        for(int i=0;i<n;i++){
            list[i]=new ArrayList<>();
        }
        int tmpu;
        int tmpv;
        int tmpw;
        for(int i=0;i<n-1;i++){
            tmpu=sc.nextInt()-1;
            tmpv=sc.nextInt()-1;
            tmpw=sc.nextInt();
            list[tmpu].add(tmpv*(tmpw%2==0?1:-1));
            list[tmpv].add(tmpu*(tmpw%2==0?1:-1));
        }
        boolean[] ans=new boolean[n];
        Queue<Integer> queue=new ArrayDeque<>();
        queue.add(0);
        ans[0]=true;
        int visited=1;
        boolean[] visit=new boolean[n];
        visit[0]=true;
        int stmp;
        int qtmp;
        while(true){
            stmp=queue.size();
            for(int j=0;j<stmp;j++){
                qtmp=queue.poll();
                for(int k=0;k<list[qtmp].size();k++){
                    if(visit[Math.abs(list[qtmp].get(k))])continue;
                    visit[Math.abs(list[qtmp].get(k))]=true;
                    queue.add(Math.abs(list[qtmp].get(k)));
                    if(list[qtmp].get(k)>0){
                        ans[Math.abs(list[qtmp].get(k))]=ans[qtmp];
                    }else{
                        ans[Math.abs(list[qtmp].get(k))]=!ans[qtmp];
                    }
                    visited++;
                }
            }
            if(visited==n){
                break;
            }
        }
        for(boolean a:ans){
            System.out.println(a?1:0);
        }
 
    }

}