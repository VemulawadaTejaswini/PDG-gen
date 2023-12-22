import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int yono = 0;
        if(s / 100 < 13 && s / 100 > 0){
            yono++;
        }
        if(s % 100 < 13 && s % 100 > 0){
            yono += 2;
        }
        if(yono == 0){
            System.out.println("NA");
        }else if(yono == 1){
            System.out.println("MMYY");
        }else if(yono == 2){
            System.out.println("YYMM");
        }else{
            System.out.println("AMBIGUOUS");
        }
        sc.close();
    }
}