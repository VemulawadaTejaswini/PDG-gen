import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int l = stdIn.nextInt();
        int r = stdIn.nextInt();
 
        int min = Integer.MAX_VALUE;
        for(int i=l; (i<=r-1 && i<l+2019); i++){
            for(int j=i+1; (j<=r && j<i+2020); j++){
                if(((long)i*j) % 2019 < min){
                    min = (int)(((long)i*j) % 2019);
                }
            }
        }
 
        System.out.println(min);
    }
}