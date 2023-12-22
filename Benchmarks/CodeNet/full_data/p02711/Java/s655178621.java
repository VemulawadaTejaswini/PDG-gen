import java.util.Sacnner;
public class Main{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        while( n > 0){
            if(n%10 == 7){
                System.out.println("YES");
                return;
            }
            else n = n/10;
        }
    }
}