import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> List = new ArrayList<>();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            int num = sc.nextInt();
            int b_num = num - (i+1);
            List.add(b_num);
        }
        Collections.sort(List);
        int mid = List.get((int)Math.ceil(N/2));
        int sum = 0;
        for(int i=0;i<List.size();i++) sum+= Math.abs(List.get(i)-mid);
        System.out.println(sum);
    }
}
