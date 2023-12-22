import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();
        
      	if(S == "AAA" || S == "BBB"){
        	System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}