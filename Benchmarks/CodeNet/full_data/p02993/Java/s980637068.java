import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<10;i++){
            if(s.replaceAll(Integer.toString(i)+Integer.toString(i), "").length()!=4){
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");

    }


}