import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int people = 1;
        int now = y+2*z;

        while(now+y+z<=x){
            people++;
            now+=(y+z);
            //System.out.println(now);
        }

        System.out.println(people);

    }
}

