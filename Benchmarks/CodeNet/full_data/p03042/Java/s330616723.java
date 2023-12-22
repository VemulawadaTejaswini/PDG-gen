import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner stdle = new Scanner(System.in);
		// 整数の入力
		int a = stdle.nextInt();
        int front = a/100;
        int back = a%100;

        if(front == 0 || back == 0){
            NA();
        }
        int flagF = 0;
        int flagB = 0;
        
        


        if(front > 12){
            flagF = 1;
        }
        if(back > 12){
            flagB = 1;
        }

        if(flagF == 1 && flagB == 1){
            NA();
        }

        if(flagF == 0 && flagB == 0){
            AMBIGUOUS();
        }

        if(flagF == 1 && flagB == 0){
            YYMM();
        }

        if(flagF == 0 && flagB == 1){
            MMYY();
        }

    }
    
    public static void YYMM(){
        System.out.println("YYMM");
    }
    public static void MMYY(){
        System.out.println("MMYY");
    }
    public static void AMBIGUOUS(){
        System.out.println("AMBIGUOUS");
    }
    public static void NA(){
        System.out.println("NA");
    }
}