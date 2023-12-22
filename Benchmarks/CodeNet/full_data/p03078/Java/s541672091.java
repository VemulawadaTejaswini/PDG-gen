import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Long> xList = new ArrayList<>();
        List<Long> zList = new ArrayList<>();
        List<Long> xyList = new ArrayList<>();
        List<Long> xyzList = new ArrayList<>();
        
        int xNum = sc.nextInt();
        int yNum = sc.nextInt();
        int zNum = sc.nextInt();
        int kNum = sc.nextInt();
        
        for(int i = 0; i < xNum; i++){
            xList.add(sc.nextLong());
        }
        for(int i = 0; i < yNum; i++){
            long tmpY = sc.nextLong();
            for(int j = 0; j < xNum; j++){
                xyList.add(tmpY + xList.get(j));
            }
        }
        
        for(int i = 0; i < zNum; i++){
            zList.add(sc.nextLong());
        }
        
        Collections.sort(xyList, Collections.reverseOrder());
        
        for(int i = 0; i < xyList.size(); i++){
            for(int j = 0; j < zNum; j++){
                xyzList.add(xyList.get(i) + zList.get(j));
            }
        }
        
        Collections.sort(xyzList, Collections.reverseOrder());
        
        for(int i = 0; i < kNum; i++){
            System.out.println(xyzList.get(i));
        }
        
        
    }
}
