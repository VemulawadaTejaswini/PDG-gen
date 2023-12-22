import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner obj1=new Scanner(System.in);
        int A=obj1.nextInt();
                int B =obj1.nextInt();
                int count=0;
                int x=1;
                int result;
                while (true){
                    result=A*x;
                    count++;
                    x++;
                    if (result>=B)
                    break;
                }
        System.out.println(count);

    }
}