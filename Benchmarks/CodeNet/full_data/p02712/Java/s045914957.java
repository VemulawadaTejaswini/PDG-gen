import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int x = stdIn.nextInt();
        long a=0;
        for(int i=1;i<=x;i++){
            if(i%3==0||i%5==0)continue;
            a=a+i;
        }
        System.out.println(a);
    }
}
