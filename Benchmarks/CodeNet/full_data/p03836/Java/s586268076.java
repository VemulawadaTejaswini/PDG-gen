import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for (int i=sy; i<ty; i++){
            sb.append("U");
        }
        for (int i=sx; i<tx; i++){
            sb.append("R");
        }
       
        for (int i=sy; i<ty; i++){
            sb.append("D");
        }
        for (int i=sx; i<tx; i++){
            sb.append("L");
        }
        
        sb.append("L");
        for (int i=sy; i<ty+1; i++){
            sb.append("U");
        }
        for (int i=sx; i<tx+1; i++){
            sb.append("R");
        }
        sb.append("D");
        
        sb.append("R");
        for (int i=sy; i<ty+1; i++){
            sb.append("D");
        }
        for (int i=sx; i<tx+1; i++){
            sb.append("L");
        }
        sb.append("U");

        System.out.println(sb.toString());
    }

}
