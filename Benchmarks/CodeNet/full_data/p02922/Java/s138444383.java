import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i=1; i<B; i++){
            if((A-1)*i+1>=B){
                System.out.println(i);
                break;
            }
        }
    }
}