import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double po=0;
        for(int i=0;i<n;i++){
            po+=1.0/sc.nextInt();
        }
        System.out.println(1.0/po);
    }
}
