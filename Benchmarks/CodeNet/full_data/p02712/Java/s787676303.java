import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int inputNum = Integer.parseInt(sc.next());
        int sum = 0;
        
        for(int i = 1; i <= inputNum; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                continue;
            } else if(i % 3 == 0) {
                continue;
            } else if(i % 5 == 0) {
                continue;
            } else {
                sum += i;
            }
        }

        System.out.println(sum);
        sc.close();
    }
}