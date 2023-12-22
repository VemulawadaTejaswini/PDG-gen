import java.util.Scanner;

public class Main {

    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args) {
        String s = stdIn.next();
        char[] sc = s.toCharArray();

        int first = (sc[0]-'0')*10 + (sc[1]-'0');
        int second = (sc[2]-'0')*10 + (sc[3]-'0');

        boolean firstIsYY = false;
        boolean firstIsMM = false;
        boolean secondIsYY = false;
        boolean secondIsMM = false;

        if(1<=first && first <=12){
            firstIsMM = true;
        }
        if(0<= first && first <=99){
            firstIsYY = true;
        }

        if(1<=second && second <=12){
            secondIsMM = true;
        }
        if(0<= second && second <=99){
            secondIsYY = true;
        }

        if((firstIsYY && secondIsMM) && (firstIsMM && secondIsYY)){
            System.out.println("AMBIGUOUS");
        }else if(firstIsMM && secondIsYY){
            System.out.println("MMYY");
        }else if(firstIsYY && secondIsMM){
            System.out.println("YYMM");
        }else{
            System.out.println("NA");
        }

    }
}