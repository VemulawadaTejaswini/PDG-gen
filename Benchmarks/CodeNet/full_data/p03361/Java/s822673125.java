import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.text.DecimalFormat;

public class Main{
    public static void main(String[] args) throws Exception {
        //入力されたマス目を用意する
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        System.out.print("キャンバスの大きさ:");
        String strn = br.readLine();//キャンバスの数入力
        //入力された文字を分解
        int w = 0;
        int j = 0;

        if(strn.length() == 3){
        w = Character.getNumericValue(strn.charAt(0));
        j = Character.getNumericValue(strn.charAt(2));
        }else{
        w = Integer.parseInt(strn.substring(0,strn.length()/2));
        j = Integer.parseInt(strn.substring(strn.length()/2+1,strn.length()));
        }

        String canvas[][] = new String[w][j];
        //wの数だけキャンバス入力
        for(int i = 0;i < w;i++){
        System.out.print((i+1)+"列目のマス:");
        String strCanvasLine = br.readLine();//キャンバスの数入力
            //配列に格納
            for(int x = 0;x<j;x++){
                canvas[i][x] = String.valueOf(strCanvasLine.charAt(x));
            }
        }

       
        
        //上下左右に１つでも＃があるのか網羅
        for(int wline = 0 ; wline < w ; wline++){
            for(int jline=0 ; jline < j ; jline++){
                if(canvas[wline][jline].equals("#")){//黒に塗りたい場所
                        boolean near = true;
                       //上下左右に場所があるかを確認
                        if(!(wline == 0)){//上がある
                            if(!(canvas[wline-1][jline].equals("#"))){
                                //上に黒がない
                                near = false;
                            }else{//上に黒がある
                                continue;
                            }
                        }

                        if(!(wline == w-1)){//下がある
                            if(!(canvas[wline+1][jline].equals("#"))){
                                //下に黒がない
                                near = false;
                            }else{//上に黒がある
                                continue;
                            }
                        }

                        if(!(jline == 0)){//左がある
                            if(!(canvas[wline][jline-1].equals("#"))){
                                //左に黒がない
                                near = false;
                            }else{//上に黒がある
                                continue;
                            }
                        }

                        if(!(jline == j-1)){//右がある
                            if(!(canvas[wline][jline+1].equals("#"))){
                                //右に黒がない
                                near = false;
                            }else{//上に黒がある
                                continue;
                            }
                        }

                        if(!(near)){
                            System.out.println("No");
                            System.exit(0);
                        }
                }
            }

        }

        System.out.println("Yes");
    }

}
