import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> P = new ArrayList<>();
        for(int i=0;i<N;i++)P.add(sc.nextInt());
        int sum = 0;
        for(int i=0;i<N;i++){
            boolean check = true;
            for(int j=0;j<=i;j++) if(P.get(i)>P.get(j)) check = false;
            if(check) sum++;
        }
        System.out.println(sum);
    }
}
