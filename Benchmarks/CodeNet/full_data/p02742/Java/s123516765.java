import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long H = sc.nextLong();
        Long W = sc.nextLong();
        if(H*W == 1)
          System.out.println(1);
        else if(H*W%2==0)
          System.out.println(H*W/2);
        else
          System.out.println(H*W/2+1);
    }

}
