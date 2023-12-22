import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        try{
            int age = scanner.nextInt();
            if (age<0 || age>100) return;
            int adultPrice = scanner.nextInt();
            if(adultPrice < 1 || adultPrice > 1000) return;
            int finalPrice = -1;
            if(age>-1&&age<5) finalPrice = 0;
            else if(age>5&&age<13) finalPrice = adultPrice/2;
            else finalPrice = adultPrice;
            System.out.println(finalPrice);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            scanner.close();
        }
    }
}
