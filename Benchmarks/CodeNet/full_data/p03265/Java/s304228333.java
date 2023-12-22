import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int xs = x1 - x2;
        int ys = y1 - y2;
        int xs2 = x2 - x1;
        int ys2 = y2 - y1;
        
        if(x1 >= x2 && y1 >= y2){
            System.out.println((x2 + ys) + " " + (y2 - xs) + " " + (x1 + xs) + " " + (y1 - ys));
        }
        if(x1 <= x2 && y1 <= y2){
            System.out.println((x2 - ys2) + " " + (y2 + xs2) + " " + (x1 - ys2) + " " + (y1 + xs2));
        }
        if(x1 > x2 && y1 < y2){
            System.out.println((x2 - ys2) + " " +  (y2 - xs) + " " + (x1 - ys2) + " " + (y1 - xs));
        }
        if(x1 < x2 && y1 > y2){
            System.out.println((x2 + ys) + " " +  (y2 + xs2) + " " + (x1 + ys) + " " + (y1 + xs2));
        }
    }
}
