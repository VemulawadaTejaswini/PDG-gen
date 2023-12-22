
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int allmenber = sc.nextInt();
        String menbercoller = sc.next();
        String redcoller = menbercoller.replace("B","");
        int rednumber = redcoller.length();
        if(rednumber*2 < allmenber){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
    
}
