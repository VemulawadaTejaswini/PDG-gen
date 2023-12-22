import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int px;
        ArrayList inputList = new ArrayList<Integer>();
        inputList.add(X);

        for(int i=0; i<N; i++){
            px = sc.nextInt();
            inputList.add(px);
        }
        Collections.sort(inputList);

        int result = 99999;
        int next = 0;

        for(int i=0; i<inputList.size()-1; i++){
            next = (int) inputList.get(i+1) - (int) inputList.get(i);
            if(next < result){
                result = next;
            }

        }


        System.out.println(result);
    }


}