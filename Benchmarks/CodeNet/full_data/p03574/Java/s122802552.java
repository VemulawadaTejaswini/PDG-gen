import java.util.*;
public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] s = new char[h][w];

        for(int i =0;i<h;i++){
            String a = sc.next();
            for(int j =0;j<w;j++){
                s[i][j] = a.charAt(j);
            }
        }
        
    }
}




