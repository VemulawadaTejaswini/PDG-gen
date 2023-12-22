import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int s = Integer.parseInt(sc.next());
        int left = s / 100;
        int right = s % 100;
        
        if(1 <= left && left <= 12){
            if(1 <= right && right <= 12){
                System.out.println("AMBIGUOUS");
            }else{
                System.out.println("MMYY");
            }
        }else if(1 <= right && right <= 12){
            System.out.println("YYMM");
        }else{
            System.out.println("NA");
        }
    }
}