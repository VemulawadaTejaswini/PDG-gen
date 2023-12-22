import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for(int i =0; i < n ;i ++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        long sum = 0;
        int num = -1;
        for(int i = 0;i < (n-1)/2;i++){
           sum += Math.abs(list.get(n-1-i) - list.get(i));
           if(num != -1){
               sum += Math.abs(list.get(n-1-i) - num);
           }
           num =  list.get(i);
        }
        if(n % 2 == 0) {
            sum += Math.abs(list.get(n/2) - num);
            sum += Math.abs(list.get(n-1) - list.get(n/2-1));
        } else {
            sum += Math.max(Math.abs(list.get(n-1) - list.get(n/2)), Math.abs(num - list.get(n/2)));
        }

        System.out.println(sum);
    }
}