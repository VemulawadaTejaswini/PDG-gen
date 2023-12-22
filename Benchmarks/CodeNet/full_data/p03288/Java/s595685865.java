import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int rate = sc.nextInt();
        if(rate < 1200){
            System.out.println("ABC");
        }else if(1200 <= rate && rate < 2800){
            System.out.println("ARC");
        }else if(rate >= 2800){
            System.out.println("AGC");
        }
    }
}