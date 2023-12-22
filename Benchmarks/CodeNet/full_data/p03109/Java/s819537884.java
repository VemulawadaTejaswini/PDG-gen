import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        if(Character.getNumericValue(s.charAt(5))==1||Character.getNumericValue(s.charAt(6))>4){
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }

}