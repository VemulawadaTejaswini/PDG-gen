import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int r = 0;
        int l = 1;
        int i = 0;
        try {
            while (i != '\n') {
                while (i != 'L' && i != '\n'){ i = System.in.read(); if(i=='\n' || i == 'L'){break;} r++;}
                while (i != 'R' && i != '\n'){ i = System.in.read(); if(i=='\n' || i == 'R'){break;} l++;}
                for(int p=0;p<r-1;p++){
                    System.out.print("0 ");
                }
                int r2 = (r-1)/2;
                int l2 = (l-1)/2;
                System.out.print(r2 + (l-1-l2) + 1 + " ");
                System.out.print((r-1-r2)+l2 + 1 + " ");
                for(int p=0;p<l-1;p++){
                    System.out.print("0 ");
                }
                r=1;
                l=1;
            }
        }catch(Exception e){
            return;
        }
        System.out.println();
        return;
    }
}
