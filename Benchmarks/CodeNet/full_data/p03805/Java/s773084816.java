import java.util.*;

public class Main{
    static int ans=0;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int m=Integer.parseInt(sc.next());
        ArrayList<ArrayList<Integer>> connect=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<=n;i++){
            connect.add(new ArrayList<Integer>());
        }
        for(int k=0;k<m;k++){
            int a_k=Integer.parseInt(sc.next());
            int b_k=Integer.parseInt(sc.next());
            connect.get(a_k).add(b_k);
            connect.get(b_k).add(a_k);
        }
        HashSet<Integer> to_visit=new HashSet<>();
        for(int i=1;i<=n;i++){
            to_visit.add(i);
        }            
        int st=1;
        System.out.println(goal_count(connect, to_visit, st));
    }

    public static int goal_count(ArrayList<ArrayList<Integer>> connect, HashSet<Integer> to_visit, int st){
        if(to_visit.size()==0){
            return 1;
        }
        int pathes=0;
        for(int v:connect.get(st)){
            if(to_visit.contains(v)){
                to_visit.remove(v);
                pathes+=goal_count(connect, to_visit, v);
            }
        }
        return pathes;
    }
}