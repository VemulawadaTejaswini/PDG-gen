import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String first = S.substring(0,2);
        String end = S.substring(2,4);

        int YY = Integer.parseInt(first);
        int MM = Integer.parseInt(end);
        
        if (YY >= 1 && YY <=12){
            if(MM >= 1 && MM <= 12){
                System.out.print("AMBIGUOUS");
            }else{
                System.out.print("MMYY");
            }
        }else{
            if(MM >= 1 && MM <= 12){
                System.out.print("YYMM");
            }else{
                System.out.print("NA");
            }
        }



    }
}