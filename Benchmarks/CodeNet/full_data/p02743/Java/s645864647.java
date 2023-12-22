import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if((Math.sqrt(a) + Math.sqrt(b)) < Math.sqrt(c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}