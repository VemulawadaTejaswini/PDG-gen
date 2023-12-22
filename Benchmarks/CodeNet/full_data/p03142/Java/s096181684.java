import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> List = new ArrayList<>();
        for(int a=0;a<N;a++){
            ArrayList<Integer> each_node = new ArrayList<>();
            List.add(each_node);
        }
        for(int a=0;a<N-1+M;a++){
            int s = sc.nextInt();
            int t = sc.nextInt();
            List.get(t-1).add(s);
        }
        for(int a=0;a<N;a++){
            if(List.get(a).size()==0) List.get(a).add(0);
        }
        for(int a=0;a<N;a++){
            System.out.println(List.get(a).get(0));
        }
    }
}
