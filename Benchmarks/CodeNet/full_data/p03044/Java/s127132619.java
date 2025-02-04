import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i,a,b,c;
        int []color = new int[n+1];
        Set<Integer> done = new HashSet<>();
        for(i=1;i<n+1;i++){
            color[i] = 0;
    }
        EvenRataion []mark = new EvenRataion[n+1];
        for(i=1;i<n+1;i++){
            mark[i] = new EvenRataion();
        }
        for(i=0;i<n-1;i++){
            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();
            if (c%2==0){
                mark[a].even.add(b);
                mark[b].even.add(a);
            }
            else {
                mark[a].odd.add(b);
                mark[b].odd.add(a);
            }
        }
        List<Integer> run = new ArrayList<>();
        run.add(1);
        List<Integer> temp = new ArrayList<>();
        while (run.size()>0){
            int y = run.get(0);
            run.remove(0);
            done.add(y);
            if (color[y]==0){
                for(int v:mark[y].odd){
                    if(!done.contains(v)){
                        run.add(v);
                        color[v] = 1;
                        temp.add(v);
                    }
                }
                for(int v:mark[y].even){
                    if(!done.contains(v)){
                        temp.add(v);
                    }
                }
            }
            else{
                for(int v:mark[y].even){
                    if(!done.contains(v)){
                        run.add(v);
                        color[v] = 1;
                        temp.add(v);
                    }
                }
                for(int v:mark[y].odd){
                    if(!done.contains(v)){
                        temp.add(v);
                    }
                }

            }
            if(run.size()==0){
                run.addAll(temp);
                temp.clear();
            }
        }
        for(i=1;i<n+1;i++){
            System.out.println(color[i]);
    }
    }
    static class EvenRataion{
        Set<Integer> even = new HashSet<>();
        Set<Integer> odd = new HashSet<>();

    }
}