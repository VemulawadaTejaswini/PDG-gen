import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine();
        char[][] map = new char[H][W];
        for (int i = 0; i < H; i++) {
        	map[i] = sc.nextLine().toCharArray();
        }
        
        boolean exit = false;
        for (int h = 0; h < H; h++) {
        	for (int w = 0; w < W; w++) {
        		if (map[h][w] == '#') 
        			if (!check(map,h,w,H,W)) {
        				exit = true;
        				break;
        			}
        	}
        	if (exit) break;
        }
        if (exit) {
        	System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
    
    public static boolean check(char[][] map, int h, int w, int H, int W) {
    	if (h - 1 > -1 && map[h - 1][w] == '#') {//up
    		return true;
    	} else if (h + 1 < H && map[h + 1][w] == '#') {//down
    		return true;
    	} else if (w - 1 > -1 && map[h][w - 1] == '#') {
    		return true;
    	} else if (w + 1 < W && map[h][w + 1] == '#') {
    		return true;
    	}
    	return false;
    }
    
}