import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        String[] s = new String[h];
        boolean[] row = new boolean[h];
        boolean[] col = new boolean[w];
        Arrays.fill(row, false);
        Arrays.fill(col, false);
        
        for(int i=0; i<h; i++){
            s[i] = sc.next();
            for(int j=0; j<w; j++){
                if(s[i].charAt(j) == '#'){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i=0; i<h; i++){
            if(row[i]){
                for(int j=0; j<w; j++){
                    if(col[j]){
                        System.out.print(s[i].charAt(j));
                    }
                }
                System.out.println();
            }
        }
    }
}