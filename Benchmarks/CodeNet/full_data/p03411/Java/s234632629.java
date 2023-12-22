import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        Pair[] red = new Pair[n];
        for(int i = 0; i < n; i++){
            red[i] = new Pair(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        Pair[] blue = new Pair[n];
        for(int i = 0; i < n; i++){
            blue[i] = new Pair(Integer.parseInt(sc.next()), Integer.parseInt(sc.next()));
        }
        
        Arrays.sort(blue, Comparator.comparingInt(Pair::getX));
        Arrays.sort(red, Comparator.comparingInt(Pair::getY).reversed());
        
        boolean[] red2 = new boolean[n];
        Arrays.fill(red2, true);
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(red2[j] && blue[i].x > red[j].x && blue[i].y > red[j].y){
                    count++;
                    red2[j] = false;
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
    
    static class Pair {
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }
}