import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int H = Integer.parseInt(str[0]);
        int W = Integer.parseInt(str[1]);
        String[] s = new String[H];
        String[] result = new String[H];
        for(int i = 0 ; i < H ; i++) {
            s[i] = stdR.readLine();
        }
        for(int i = 0 ; i < H ; i++) {
            String st = "";
            for(int j = 0 ; j < W ; j++) {
                st += wall(j,i,s);
            }
            result[i] = st;
        }
        for(int i = 0 ; i < H ; i++) {
            System.out.println(result[i]);
        }
        
    }
    
    public static String wall(int x,int y, String[] s) {
        if(s[y].charAt(x) == '#')return "#";
        int[] xs = {-1,0,1,-1,1,-1,0,1};
        int[] ys = {-1,-1,-1,0,0,1,1,1};
        int count = 0;
        for(int i = 0 ; i < xs.length ; i++) {
            if(x + xs[i] >= 0 && x + xs[i] < s[0].length() && y + ys[i] >= 0 && y + ys[i] < s.length && s[y + ys[i]].charAt(x + xs[i]) == '#')count++;
        }
        return String.valueOf(count);

    }
}
