import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        long minimum = sc.nextLong();
        for(int i = 0; i < 4; i++){
            long pathNum = sc.nextLong();
            if(minimum > pathNum){
                minimum = pathNum;
            }
        }
        System.out.println((total / minimum) + 5);
    }
}
