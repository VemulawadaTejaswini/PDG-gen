import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long a = scanner.nextInt();
        long b = scanner.nextInt();
        long count=0;
        long instance=0;
        boolean bool = true;
        while (bool){
            if (n-instance-a<0){
                count += n - instance;
                bool = false;
            }else{
                instance+=a;
                count+=a;
            }
            if (n-instance-b<0){
                break;
            }else{
                instance+=b;
            }
        }
        System.out.println(count);
    }

}