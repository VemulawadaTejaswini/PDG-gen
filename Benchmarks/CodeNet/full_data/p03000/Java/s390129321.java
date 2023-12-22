import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int x = stdIn.nextInt();
        int[] l = new int[n];
        for(int i=0; i<n; i++){
            l[i] = stdIn.nextInt();
        }
        int counter = 0;
        int zahyou = 0;
        while(!(zahyou > x)){
            zahyou = zahyou + l[counter];
            counter++;            
        }
        System.out.println(counter);
    }
}