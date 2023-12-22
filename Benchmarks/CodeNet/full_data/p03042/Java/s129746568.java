import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String YYMM = sc.nextLine();
        int flag = 0;
        if(Integer.parseInt(YYMM.substring(2)) > 12){
            flag -= 1;
        }
        if(Integer.parseInt(YYMM.substring(0,2)) > 12){
            if(flag == -1){
                flag = 2;
            }else{
                flag += 1;
            }
        }
        if(Integer.parseInt(YYMM.substring(2)) <= 0){
            flag = 2;
        }
        if(Integer.parseInt(YYMM.substring(0,2)) <= 0 ){
            flag = 2;
        }
        switch(flag){
            case 0:
                System.out.println("AMBIGUOUS");
                break;
            case 1:
                System.out.println("YYMM");
                break;
            case -1:
                System.out.println("MMYY");
                break;
            case 2:
                System.out.println("NA");
                break;
        }
    }
}