import java.util.Scanner;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = Integer.parseInt(sc.next());
        int sy = Integer.parseInt(sc.next());
        int tx = Integer.parseInt(sc.next());
        int ty = Integer.parseInt(sc.next());
        StringBuilder builder = new StringBuilder();
        int dx = tx-sx;
        int dy = ty-sy;
        char xdir = (dx>0)? 'U' : 'D';
        char ydir = (dy>0)? 'R' : 'L';
        char[] xway = new char[Math.abs(dx)];
        char[] yway = new char[Math.abs(dy)];
        Arrays.fill(xway, xdir);
        Arrays.fill(yway, ydir);
        builder.append(xway);
        builder.append(yway);
        Arrays.fill(xway, rev(xdir));
        Arrays.fill(yway, rev(ydir));
        builder.append(xway);
        builder.append(yway);
        
        xway = new char[Math.abs(dx)+1];
        yway = new char[Math.abs(dy)+1];
        Arrays.fill(xway, xdir);
        Arrays.fill(yway, ydir);
        builder.append(rev(ydir));
        builder.append(xway);
        builder.append(yway);
        builder.append(rev(xdir));

        Arrays.fill(xway, rev(xdir));
        Arrays.fill(yway, rev(ydir));
        builder.append(ydir);
        builder.append(xway);
        builder.append(yway);
        builder.append(xdir);
        
        System.out.println(builder.toString());

    }

    public static char rev(char dir){
        char result;
        if(dir=='U'){result= 'D';}
        else if(dir=='D'){result='U';}
        else if(dir=='R'){result='L';}
        else{result='R';}
        return result;
    } 
}