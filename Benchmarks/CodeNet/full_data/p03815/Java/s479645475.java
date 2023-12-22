import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long base = x/11;
        long left = x%11;
        long remain = 0;
        if(left>0&&left<=6) remain = 1;
        if(left>=7) remain = 2;
        System.out.println(2*base+remain);
    }
}
