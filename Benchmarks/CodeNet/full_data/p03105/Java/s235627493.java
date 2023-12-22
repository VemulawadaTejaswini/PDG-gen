import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Ent = new Scanner(System.in);
        int a = Ent.nextInt();
        int b = Ent.nextInt();
        int c = Ent.nextInt();
        
        int div = b / a;
        
        if(div > c){
            System.out.println(c);
        }else{
            System.out.println(div);
        }
        
    }
    
}
