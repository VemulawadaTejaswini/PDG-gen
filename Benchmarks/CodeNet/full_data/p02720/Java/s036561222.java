import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    static long top = 1;
    static long n = 1;
    static ArrayList<Long> stack = new ArrayList<Long>();
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        long k = stdIn.nextLong();

        int[] n = new int[20];
        n[0] = 1;
        for(int i=0; i<k-1; i++){
            n = nextLunLun(n);
        }

        int index = n.length-1;
        while(n[index] == 0){
            index--;
        }
        while(index >= 0){
            System.out.print(n[index]);
            index--;
        }
    }

    static int[] nextLunLun(int[] n){
        int maxIndex = n.length-1;
        while(n[maxIndex] == 0){
            maxIndex--;
        }
        int index = 0;
        while(n[index+1] < n[index] || n[index] == 9){
            index++;
        }
        if(index > maxIndex && n[maxIndex] != 9){
            index--;
        }

        if(isFin(n)){
            index = maxIndex;
            n[index+1] = 1;
            n[index] = 0;
        }else{
            n[index]++;
        }
        index--;
        while(index >= 0){
            n[index] = n[index+1]-1;
            if(n[index] < 0){
                n[index] = 0;
            }
            index--;
        }

        return n;
    }

    static boolean isFin(int[] n){
        int index = n.length-1;
        while(n[index] == 0){
            index--;
        }

        while(index >= 0 && n[index] == 9){
            index--;
        }

        return (index == -1);
    }
}