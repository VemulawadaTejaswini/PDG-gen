import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
        Set<Integer> set_a = new HashSet<Integer>();
        Set<Integer> set_b = new HashSet<Integer>();

        for(int i = 2; i <= a; i++){
            if(a % i == 0) set_a.add(i);
            while(a % i == 0){
                a /= i;
            }
            if(a == 1) break;
        }
        for(int i = 2; i <= b; i++){
            if(b % i == 0) set_b.add(i);
            while(b % i == 0){
                b /= i;
            }
            if(b == 1) break;
        }

        int count = 0;
        for(int x: set_a){
            if(set_b.contains(x)) count++;
        }

        System.out.println(count + 1);

    }

}
