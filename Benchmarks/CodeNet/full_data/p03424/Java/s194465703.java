import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
      	int a = scanner.nextInt();
        String arare[] = new String[a];
		for(int x = 0;x<a;x++) {
			arare[x] = scanner.next();
        }
        int n = 0;
        boolean i = false;
        String str = "Y";
        for(n = 0;n < a;n++){
         	if(str.equals(arare[n]))i = true;
        }
      
        if(i){
            System.out.println("Four");
        }else{
          System.out.println("Three");
        }
    }
}