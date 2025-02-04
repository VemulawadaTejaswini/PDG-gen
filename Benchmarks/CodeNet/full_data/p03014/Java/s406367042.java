import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        ArrayList<String> strs = new ArrayList<>();
        
        int[][] lines = new int[H][W];
        int[][] rows = new int[H][W];
        
        for(int i=0;i<H;i++) strs.add(sc.next());

        int startLine;
        int line;
        for (int i=0; i<H; i++){
            startLine=0;
            line=0;
            for (int j=0; j<W; j++){
                if (strs.get(i).charAt(j)=='.'){
                    line++;
                }else {
                    if(line!=0) {
                        for(int k=startLine;k<j;k++){
                            lines[i][k] = line;
                        }
                        line = 0;
                    }
                    startLine=j+1;
                }

                if(j==W-1){
                    if(line!=0) {
                        for(int k=startLine;k<W;k++){
                            lines[i][k] = line;
                        }
                        line = 0;
                    }
                    startLine=j+1;
                }
            }
        }

        for (int i=0; i<W; i++){
            startLine=0;
            line=0;
            for (int j=0; j<H; j++){
                if (strs.get(j).charAt(i)=='.'){
                    line++;
                }else {
                    if(line!=0) {
                        for(int k=startLine;k<j;k++){
                            rows[k][i] = line;
                        }
                        line = 0;
                    }
                    startLine=j+1;
                }

                if(j==H-1){
                    if(line!=0) {
                        for(int k=startLine;k<H;k++){
                            rows[k][i] = line;
                        }
                        line = 0;
                    }
                    startLine=j+1;
                }
            }
        }

        int max=0;
        for (int i=0; i<H; i++) {
            for (int j = 0; j < W; j++) {
                max= max(max,lines[i][j]+rows[i][j]-1);
            }
        }

        System.out.println(max);

    }
}
