import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    /**
     * Iterate through each line of input.
     */

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();

        for(int i=input.length-1; i>=0; i--){
            char[] array = new char[i];
            for(int j=0; j<i; j++){
                array[j] = input[j];
            }
            if(check(array)){
                System.out.println(array.length);
                break;
            }
        }
    }

    boolean check(char[] array){
        int leftNum = array.length / 2;
        int rightNum = array.length - leftNum;

        if(leftNum != rightNum){
            return false;
        } else {
            char[] left = new char[leftNum];
            char[] right = new char[rightNum];
            int count = 0;

            for(int i=0; i<leftNum; i++){
                if(array[i] == array[i+leftNum]){
                    count++;
                }
            }
            if(count == leftNum){
                return true;
            }

            return false;
        }
    }
}
