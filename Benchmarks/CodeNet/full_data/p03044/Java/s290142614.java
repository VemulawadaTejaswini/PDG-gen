import java.util.*;
 
public class Main{
    
    static int N;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        N = sc.nextInt();
        int root = 0;
        int[][] u = new int[3][N-1];
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= N; i++)
            list.add(i);
        HashMap<Integer, Integer> par = new HashMap<>();
        HashMap<Integer, HashMap<Integer, Integer>> dis = new HashMap<>();
        for(int i = 0; i < N-1; i++){
            u[0][i] = sc.nextInt();
            u[1][i] = sc.nextInt();
            u[2][i] = sc.nextInt();
            if(i == 0){
                root = u[1][i];
            }
            if(par.containsKey(u[0][i])){
                par.put(u[1][i], u[0][i]);
                dis.put(u[1][i], new HashMap<Integer, Integer>());
                dis.get(u[1][i]).put(u[0][i], u[2][i]);
                list.remove(list.indexOf(u[1][i]));
            } else{
                par.put(u[0][i], u[1][i]);
                dis.put(u[0][i], new HashMap<Integer, Integer>());
                dis.get(u[0][i]).put(u[1][i], u[2][i]);
                list.remove(list.indexOf(u[0][i]));
            } 
        }
        sc.close();
        root = list.get(0);
        
        int count = 0;
        int pos = 0;
        int[] dis_0 = new int[N];
        while(count < N) {
            if(par.containsKey(pos+1)){
                if(dis_0[par.get(pos+1)-1] != 0 || par.get(pos+1) == root){
                    dis_0[pos] += dis_0[par.get(pos+1)-1] + dis.get(pos+1).get(par.get(pos+1));
                    count++;
                    System.out.println(pos + " " + dis_0[pos]);
                }
            }
            pos++;
            if(pos == N)
                pos = 0;
        }
        for(int i = 0; i < N; i++)
            System.out.println(dis_0[i] % 2);      
    }
}