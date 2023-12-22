import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x==2 && y==2) System.out.println(0);
        else System.out.println(Math.max(x-2,1)*Math.max(1,y-2));
    }
}