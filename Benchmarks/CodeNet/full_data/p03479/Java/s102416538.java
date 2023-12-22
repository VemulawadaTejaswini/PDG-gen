import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();

        int count = -1;

        while(x < y){
            x *= 2;
            count++;
        }

        System.out.println(count);
    }
}