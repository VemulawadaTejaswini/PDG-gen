import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double asum = Math.floor(a/0.08);
        double bsum = Math.floor(b/0.1);
        double afloor = Math.floor(asum/10)*10;
        double bfloor = Math.floor(bsum/10)*10;
        if(afloor == bfloor){
            if(asum>bsum){
                System.out.println((int)asum);
            }else{
                System.out.println((int)bsum);
            }
        }else{
            System.out.println(-1);
        }
    }
}
