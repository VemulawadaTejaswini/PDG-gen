import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        long mod = (long)Math.pow(10,9)+7;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int total = 0;
        ArrayList<Integer> li = new ArrayList<Integer>();
        while(n > total){
            total += i;
            li.add(i);
            i++;
        }
        if(total - n != 0){
            li.remove(total-n-1);
        }
        for(int a : li){
            System.out.println(a);
        }
    }
}
