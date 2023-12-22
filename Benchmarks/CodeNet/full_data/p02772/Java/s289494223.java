import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int time=0;
        boolean flag = true;
            while(flag&&time<n){
                int m = sc.nextInt();
                if(m%2==0){
                    if(!(m%3==0||m%5==0)) {
                        System.out.println("DENIED");
                        flag = false;
                    }
                }
                time++;
            }
        if(flag)
            System.out.println("APPROVED");
}}