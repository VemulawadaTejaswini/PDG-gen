import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        
        int gapx = tx -sx;
        int gapy = ty -sy;
        
        String route = "";
        
      	//1週目
        for(int i = 0; i < gapy; i++){
            route += "U";
        }
        for(int i = 0; i < gapx; i++){
            route += "R";
        }
        for(int i = 0; i < gapy; i++){
            route += "D";
        }
        for(int i = 0; i < gapx; i++){
            route += "L";
        }

        //2週目 
        route += "L";
        for(int i = 0; i < gapy+1; i++){
            route += "U";         
        }
        for(int i = 0; i < gapx+1; i++){
            route += "R";
        }
            route += "D";
            route += "R";
        for(int i = 0; i < gapy+1; i++){
            route += "D";
        }
        for(int i = 0; i < gapx+1; i++){
            route += "L";
        }
        route += "U";

        //answer
        System.out.print(route);
    }
}
