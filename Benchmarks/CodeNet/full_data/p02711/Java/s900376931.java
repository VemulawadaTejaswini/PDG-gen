import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner stdIn= new Scanner(System.in);
        int x = stdIn.nextInt();
        boolean s=false;
        if(x/100==7){
            s=true;
        }else if(x%100/10==7){
            s=true;
        }else if(x%10==7){
            s=true;
        }
        if(s){
           System.out.println("Yes"); 
        }else{
            System.out.println("No");
        }
    }
}
