import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int first = Integer.parseInt(str.substring(0,2));
        int second = Integer.parseInt(str.substring(2, 4));

        if(first==0 || first >12){
            if(second==0 || second > 12){
                System.out.println("NA");
            }
            else{
                System.out.println("YYMM");
            }
        }
        else{
            if(second==0 || second > 12){
                System.out.println("MMYY");
            }
            else{
                System.out.println("AMBIGUOUS");
            }
        }
    }
}