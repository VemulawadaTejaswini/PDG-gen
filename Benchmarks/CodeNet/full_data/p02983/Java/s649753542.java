import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        if((b-a)==(b%2019)-(a%2019)&&(a%2019)!=0&&(b%2019)!=0){
            System.out.println(((a%2019)*((a+1)%2019))%2019);
        }else{
            System.out.println(0);
        }
    }
}