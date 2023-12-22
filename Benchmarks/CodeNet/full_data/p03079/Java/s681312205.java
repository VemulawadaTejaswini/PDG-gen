import java.util.*;


public class Main {
    public static void Main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String x[] = line.split(" ");
        int hen1 = Integer.valueOf(x[0]);
        int hen2 = Integer.valueOf(x[1]);
        int hen3 = Integer.valueOf(x[2]);
        if(hen1==hen2&&hen2==hen3&&hen1==hen3){
            System.out.println("Yes");
        }else{
            System.out.println("No")
        }
    }
}