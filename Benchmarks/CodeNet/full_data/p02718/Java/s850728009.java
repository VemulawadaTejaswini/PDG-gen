import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        int totalVote = 0;
        for(int i=0; i<N; i++){
            int a = scanner.nextInt();
            A.add(a);
            totalVote += a;
        }
        Collections.sort(A, Comparator.reverseOrder());

        if(A.get(M-1) < totalVote/(4.0*M)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }

}