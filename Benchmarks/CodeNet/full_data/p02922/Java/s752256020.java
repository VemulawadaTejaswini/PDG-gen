
import java.util.*;
import java.lang.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int tapNumber = 0;
        int mouseNumber = 1;
        int min = 0;

        while(true){
            mouseNumber = tapNumber * (A - 1) + 1;
            if(mouseNumber >= B){
                min = tapNumber;
                break;
            }
            tapNumber ++;
        }


        System.out.println(min);

    }
}



