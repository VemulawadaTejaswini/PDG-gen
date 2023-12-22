import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int inputNum = scan.nextInt();
        ArrayList<Float> values = new ArrayList<Float>(inputNum);
        int value = 0;
        for(int i = 0; i < inputNum; i++){
            value = scan.nextInt();
            values.add((float)value);
        }
        for(int i = 0; i < inputNum; i++){
            // 昇順にソート
            Collections.sort(values);
            // 1番目と2番目を合成してリストに格納
            values.add((values.get(0) + values.get(1)) / (float)2);
            // 1番目と2番目を削除
            values.remove(0);
            values.remove(0);
            if(values.size() == 1){
                break;
            }
        }
        System.out.println(values.get(0));
        
        scan.close();
    }
  
}