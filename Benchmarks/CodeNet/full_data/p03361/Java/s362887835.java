import java.io.*;
import java.util.ArrayList;

class Main{
    static String[] s;
    static int H,W;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] sl = str.split(" ");
        H = Integer.parseInt(sl[0]);
        W = Integer.parseInt(sl[1]);
        s = new String[H];
        for (int i=0;i<H;i++){
            s[i] = br.readLine();
        }
        String ans = "Yes";
        for (int i=0;i<H;i++){
            for (int j=0;j<W;j++){
                if (String.valueOf(s[i].charAt(j)).equals("#")){
                    if (!adjacent(i, j)){
                        ans = "No";
                        break;
                    }
                }
            }
            if (ans.equals("No")){
                break;
            }
        }
        System.out.println(ans);
    }

    public static boolean adjacent(int h,int w){
        String now = String.valueOf(s[h].charAt(w));
        String up = ".";
        String down = ".";
        String left = ".";
        String right = ".";
        if (h!=H-1 && h!=0 && w!=W-1 && w!=0){
            up = String.valueOf(s[h-1].charAt(w));
            down = String.valueOf(s[h+1].charAt(w));
            left = String.valueOf(s[h].charAt(w-1));
            right = String.valueOf(s[h].charAt(w+1));
        } else if (h==0){
            if (w==0){
                down = String.valueOf(s[h+1].charAt(w));
                right = String.valueOf(s[h].charAt(w+1));
            } else if (w==W-1){
                down = String.valueOf(s[h+1].charAt(w));
                left = String.valueOf(s[h].charAt(w-1));
            } else {
                down = String.valueOf(s[h+1].charAt(w));
                left = String.valueOf(s[h].charAt(w-1));
                right = String.valueOf(s[h].charAt(w+1));
            }
        } else if (h==H-1){
            if (w==0){
                up = String.valueOf(s[h-1].charAt(w));
                right = String.valueOf(s[h].charAt(w+1));
            } else if (w==W-1){
                up = String.valueOf(s[h-1].charAt(w));
                left = String.valueOf(s[h].charAt(w-1));
            } else {
                up = String.valueOf(s[h-1].charAt(w));
                left = String.valueOf(s[h].charAt(w-1));
                right = String.valueOf(s[h].charAt(w+1));
            }
        } else {
            if (w==0){
                up = String.valueOf(s[h-1].charAt(w));
                down = String.valueOf(s[h+1].charAt(w));
                right = String.valueOf(s[h].charAt(w+1));
            } else if (w==W-1){
                up = String.valueOf(s[h-1].charAt(w));
                down = String.valueOf(s[h+1].charAt(w));
                left = String.valueOf(s[h].charAt(w-1));
            }
        }
        if (now.equals(up) || now.equals(down) || now.equals(left) || now.equals(right)){
            return true;
        } else {
            return false;
        }
    }
}