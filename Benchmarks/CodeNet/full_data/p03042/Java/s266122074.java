import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();

        int upper = s / 100;
        int lower = s % 100;

        if ((upper == 00) & (01 <= lower & lower <= 12)){
            System.out.print("YYMM");
        }if ((13 <= upper & upper <= 19) & (01 <= lower & lower <= 12)){
            System.out.print("YYMM");
        }if ((01 <= upper & upper <= 12) & (lower == 00)){
            System.out.print("MMYY");
        }if ((01 <= upper & upper <= 12) & (13 <= lower & lower <= 19)){
            System.out.print("MMYY");
        }if ((01 <= upper & upper <= 12) & (01 <= lower & lower <= 12)){
            System.out.print("AMBIGUOUS");
        }else{
            System.out.print("NA");
        }




    }
}
