import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner Ent = new Scanner(System.in);
        int a = Ent.nextInt();
        int b = Ent.nextInt();
        if(a>0 && a<10 && b<10 && b>0){
            System.out.println(a*b);
        }else{
            System.out.println(-1);
        }
    }
}