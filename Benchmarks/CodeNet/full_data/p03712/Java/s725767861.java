import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int H = Integer.parseInt(sc.next());
        int W = Integer.parseInt(sc.next());
        
        String[] s = new String[H];
        for(int i=0; i<H; i++){
            s[i] = sc.next();
        }
        
        for(int i=0; i<s[0].length()+2; i++){
            System.out.print("#");
        }
        System.out.println();
        
        for(int i=0; i<H; i++){
            System.out.println("#" + s[i] + "#");
        }
        
        for(int i=0; i<s[0].length()+2; i++){
            System.out.print("#");
        }
    }
}