import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        scanner.close();


        int count = 0;
        for(;;){
            int bc = count;
            for(int i = 0; i < a.length() - 1; i++){
                if(a.substring(i,i+2).equals("01") || a.substring(i,i+2).equals("10")){

                    if(i == 0) {
                        a = a.substring(i+2);
                    }
                    else if(i == a.length() - 2) {
                        a = a.substring(0,i-1);
                    }
                    else{
                        a = a.substring(0,i) + a.substring(i+2);
                    }
                    count++;
                    break;
                }
            }
            if(bc != count){
                continue;
            }else{
                break;
            }
        }
        System.out.println(count*2);
    }
}
