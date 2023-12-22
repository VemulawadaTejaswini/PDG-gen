import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    //グローバル変数を定義

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] array = new char[h][w];
        ArrayList<ArrayList<String>> ansList = new ArrayList();
        ArrayList<ArrayList<String>> finalList = new ArrayList<>();

        for(int i=0; i<h; i++){
            char[] input = sc.next().toCharArray();
            for(int j=0; j<w; j++){
                array[i][j] = input[j];
            }
        }

        for(int i=0; i<h; i++){
            boolean isAllWhite = true;
            for(int j=0; j<w; j++){
                if(array[i][j] == '#') {
                    isAllWhite = false;
                    break;
                }
            }
            if(!isAllWhite){
                ArrayList<String> each = new ArrayList();
                for(int j=0; j<w; j++){
                    each.add(String.valueOf(array[i][j]));
                }
                ansList.add(each);
            }
        }

        ArrayList<Integer> no = new ArrayList<>();
        for(int j=0; j<w; j++){
            boolean isWhite = true;
            for(int i=0; i<ansList.size(); i++){
                if(ansList.get(i).get(j).equals("#")){
                    isWhite = false;
                    break;
                }
            }
            if(isWhite){
               no.add(j);
            }
        }

        for(int i=0; i<ansList.size(); i++){
            for(int j=0; j<w; j++){
                if(no.contains(j)){
                    continue;
                } else {
                    System.out.print(ansList.get(i).get(j));
                }
            }
            System.out.println();
        }
    }
}
