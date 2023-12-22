import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();

        if(str <= 111){
            System.out.println("111");
        }else if(str <= 222){
            System.out.println("222");
        }else if(str <= 333){
            System.out.println("333");
        }else if(str <= 444){
            System.out.println("444");
        }else if(str <= 555){
            System.out.println("555");
        }else if(str <= 666){
            System.out.println("666");
        }else if(str <= 777){
            System.out.println("777");
        }else if(str <= 888){
            System.out.println("888");
        }else {
            System.out.println("999");
        }
        
    }
}