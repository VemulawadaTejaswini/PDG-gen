import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        N=sc.nextInt();
        int [] X = new int [N];
        ArrayList<Integer>list = new ArrayList<>();
        for(int a=0;a<N;a++){
            X[a]=sc.nextInt();
            list.add(X[a]);
        }
        Collections.sort(list);
        for(int a=0;a<N;a++){
            if(list.get((N+1)/2)>X[a]) System.out.println(list.get((N+1)/2));
            else System.out.println(list.get((N-1)/2));
        }
   }
}