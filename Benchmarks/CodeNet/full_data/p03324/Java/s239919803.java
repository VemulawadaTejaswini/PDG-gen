import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int d = sc.nextInt();
        int n = sc.nextInt();
        
        Integer baseNum = 1;
        for(int i = 0; i < d; i++){
            baseNum = baseNum * 100;
        }
        
        Integer sum = 0;
        Integer nextD = baseNum * 100;
        List<Integer> progression = new ArrayList<Integer>();
        for(int j = 0; j < n; j++){
            sum += baseNum;
            if(sum == nextD){
                nextD += nextD;
                sum += baseNum;
            }
            progression.add(sum);
        }
        
        System.out.println(progression.get(n - 1));
        
    }
}