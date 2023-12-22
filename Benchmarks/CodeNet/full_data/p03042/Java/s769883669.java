import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int first = Integer.parseInt(s.substring(0,2));
        int end = Integer.parseInt(s.substring(2,4));
        if((first >= 1 && first <= 12) && (end >= 1 && end <= 12)){
            System.out.println("AMBIGUOUS");
        }else if((first == 0 || first >= 13) && (end >= 1 && end <= 12)){
            System.out.println("YYMM");
        }else if((first >= 1 && first <= 12) && (end == 0 || end >= 13)){
            System.out.println("MMYY");
        }else{
            System.out.println("NA");
        }
        
    }
}
