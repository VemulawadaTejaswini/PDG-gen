import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        String s="aiueo";
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number<3200){
            System.out.println("red");
        }else{
            System.out.println(s);
        }
    }
    
}
