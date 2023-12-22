import java.util.ArrayList;
import java.util.Scanner;
public class Roller_Coaster {
    public static void main(String args[] ){
        int n = new Scanner(System.in).nextInt();
        int k= new Scanner(System.in).nextInt();
        int result =0;
        ArrayList<Integer> h = new ArrayList<Integer>();
        for(int i =0; i<n;i++){
            h.add(new Scanner(System.in).nextInt());
        }
        for(int a:h){
            if(a>=k){
                ++result;
            }
        }
        System.out.println(result);
    }
}