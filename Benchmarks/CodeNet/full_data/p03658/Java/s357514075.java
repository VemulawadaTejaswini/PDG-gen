import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N  = scanner.nextInt();
        int K  = scanner.nextInt();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0; i<N; i++){
            l.add(scanner.nextInt());
        }
        Collections.sort(l, Comparator.reverseOrder());
        int len = 0;
        for(int i=0; i<K; i++){
            len += l.get(i);
        }
        System.out.println(len);
    }
}