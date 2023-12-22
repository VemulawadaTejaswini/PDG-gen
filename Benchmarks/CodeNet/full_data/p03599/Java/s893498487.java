import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 100 * sc.nextInt();
        int b = 100 * sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        sc.close();
        double limit = 100*e/(100+e);
        double max = 0;
        int max_w = 0;
        int max_s = 0;
        for(int water = 1; water <= f; water++){
            for(int sugar = 0; sugar <= f-water; sugar++){
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
        System.out.println((max_w+max_s) + " " + max_s);
    }

    static boolean able(int a, int b, int c){
        for(int i = 0; i <= c/a; i++){
            for(int j = 0; j<= c/b; j++){
                if(a*i+b*j == c)
                    return true;
            }
        }
        return false;
    }
}