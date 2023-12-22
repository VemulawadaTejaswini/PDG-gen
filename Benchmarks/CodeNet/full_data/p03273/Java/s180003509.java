import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] c = new char[h][w];
        boolean[] ryoko = new boolean[h];
        boolean[] rtate = new boolean[w];
        Arrays.fill(ryoko, false);
        Arrays.fill(rtate, false);
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                c[i][j] = sc.next().charAt(0);
                System.out.println("("+i+", "+j+")");
                if(c[i][j] == '#'){
                    ryoko[i] = true;
                    rtate[j] = true;
                }
            }
        }
        
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                if(ryoko[i] == true && rtate[j] == true){
                    if(j == w-1){
                        System.out.println(c[i][j]);
                    }else{
                        System.out.print(c[i][j]);
                    }
                }
            }
        }
    }
}