import java.util.*;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] X= new int[N];
        List<Integer> list = new ArrayList<>();
        for (int i=0;i<N;i++){
            X[i]=sc.nextInt();
            list.add(X[i]);
        }
        Collections.sort(list);
        for (int i=0;i<N;i++){
            if (X[i]<= list.get((N/2)-1)){
                System.out.println(list.get(N/2));
            }else{
                System.out.println(list.get(N/2-1));
            }
        }
    }
}