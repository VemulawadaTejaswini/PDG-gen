import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String add="hi";
        String can="";
        String s=sc.next();
        for(int i=0;i<5;i++){
            can+=add;
            if(can.equals(s)){
                System.out.println("Yes");
                        return;
            }
        }
        System.out.println("No");
        
 
    }



}
