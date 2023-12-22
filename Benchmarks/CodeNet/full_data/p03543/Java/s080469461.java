import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int count = 1;
        for(int i = 0;i < 2;i++){
            for(int j = i+1;j < 4;j++){
                //System.out.println("i:" + i + "hikaku:" + N.substring(i,i+1));
                //System.out.println("j:" + j + "hikaku:" + N.substring(j,j+1));
                if(N.charAt(i) == N.charAt(j)){
                    count++;
                }
                //System.out.println("count:" + count);
            }
            if(count >= 3){
                System.out.println("Yes");
                break;
            }
        }
        if(count < 3){
            System.out.println("No");
        }
    }
}
