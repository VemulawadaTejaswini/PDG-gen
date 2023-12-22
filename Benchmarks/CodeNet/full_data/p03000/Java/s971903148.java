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
        int counter = 1;
        long zahyou = 0;
        for(int i=0; i<n; i++){
            zahyou += l[i];
            if(x<zahyou){
                break;
            }else{
                counter++;
            }
        }
        System.out.println(counter);
    }
}
