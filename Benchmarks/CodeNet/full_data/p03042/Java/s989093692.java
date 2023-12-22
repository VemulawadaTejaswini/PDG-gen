import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        int yy=Integer.valueOf(S.substring(0,2));
        int mm=Integer.valueOf(S.substring(2,4));
        if(isMonth(yy)&&isMonth(mm)){
            System.out.println("AMBIGUOUS");
        }else if(isMonth(mm)){
            System.out.println("YYMM");
        }else if(isMonth(yy)){
            System.out.println("MMYY");
        }else {
            System.out.println("NA");

        }

    }
    static boolean isMonth(int a){
        return a>0&&a<13;
    }

}
