import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        long count = 0;

        if(x < y){
            if(x >= 0 || y <= 0)
                count = y-x;
            else{
                if(Math.abs(x) > y)
                    count = Math.abs(x) - y + 1;
                else
                    count = y + x + 1;
            }
        } else {
            if(y >= 0)
                count = 2+(x-y);
            else if(x <= 0)
                count = x-y+2;
            else
                count = Math.abs(x+y)+1;
        }
        System.out.println(count);
    }
}