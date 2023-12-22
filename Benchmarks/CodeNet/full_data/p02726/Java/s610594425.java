

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        LinkedList<Integer>[] linkedLists=new LinkedList[n+1];
        for(int j=1;j<=n;j++){
            linkedLists[j]=new LinkedList<>();
        }
        for(int i=1;i<n;i++){
            linkedLists[i].add(i+1);
            linkedLists[i+1].add(i);
        }
        if(!linkedLists[a].contains(b)){
            linkedLists[a].add(b);
            linkedLists[b].add(a);
        }
        boolean[] org=new boolean[n+1];
        int ans[]=new int[n];
        for(int j=1;j<=n;j++){
            org[j]=true;
            Queue<Integer> queue=new LinkedList<>();
            queue.add(j);
            queue.add(-1);
            boolean[] vis=new boolean[n+1];
            int dis=1;
            vis[j]=true;

            while (!queue.isEmpty()){
                int temp=queue.poll();

                if(temp==-1){
                    if(queue.isEmpty()){
                        break;
                    }
                    dis++;
                    queue.add(-1);
                    continue;
                }

                for(Integer i:linkedLists[temp]){
                    if(!vis[i]){
                        vis[i]=true;
                        queue.add(i);
                        if(i>j){
                            ans[dis]++;
                        }
                    }
                }
            }
        }
        for(int j=1;j<n;j++){
            System.out.println(ans[j]);
        }
    }
}
