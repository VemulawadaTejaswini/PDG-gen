import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanIn = new Scanner(System.in);
        int a = scanIn.nextInt();
        int b = scanIn.nextInt();
        int c = scanIn.nextInt();
        if((a==5 && b==5) || (b==5 && c==5) || (c==5 && a==5)){
            if(a==7 || b==7 || c==7){
                System.out.println("YES");
            }
        }else{
            System.out.println("NO");
        }
    }
}
