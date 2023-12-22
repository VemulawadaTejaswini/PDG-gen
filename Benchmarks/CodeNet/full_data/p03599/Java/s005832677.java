import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 100 * sc.nextInt();
        int b = 100 * sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        double e = sc.nextDouble();
        int f = sc.nextInt();
        sc.close();
        double limit = 100*e/(100+e);
        double max = 0;
        double max_w = 0;
        double max_s = 0;
        for(double water = 1; water <= f; water++){
            for(double sugar = 0; sugar <= f-water; sugar++){
                if(able(a, b, water) && able(c, d, sugar)){
                    
                    double con = 100*sugar/(water+sugar);
                    if(con > max && con <= limit){
                        max = con;
                        max_w = water;
                        max_s = sugar;
                    }
                } else {
                    continue;
                }
            }
        }
        if(max_w == 0)
            max_w += a;
        System.out.println((int)(max_w+max_s) + " " + (int)max_s);
    }

    static boolean able(double a, double b, double c){
        for(int i = 0; i <= c/a; i++){
            for(int j = 0; j<= c/b; j++){
                if(a*i+b*j == c)
                    return true;
            }
        }
        return false;
    }
}