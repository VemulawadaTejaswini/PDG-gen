import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if(i % 2 != 0){
                list.addFirst(a);
            }else{
                list.addLast(a);
            }
        }

        if(n % 2 == 0){
            for (int i = 0; i < n; i++) {
                System.out.print(list.get(i) + " ");
            }
        }else{
            for (int i = 0; i < n; i++) {
                System.out.print(list.get(n-i-1) + " ");
            }
        }
        sc.close();
    }

}
