import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int in,j;
        Scanner scanner = new Scanner(System.in);
        in = scanner.nextInt();
        j = scanner.nextInt();
        int ass;
        int sum=0;
        for(int i=0;i<j;i++){
            ass =scanner.nextInt();
            sum+= ass;
        }
        if(sum>in){
            System.out.println("-1");
        } else {
            System.out.println(in-sum);
                    }

    }
}
