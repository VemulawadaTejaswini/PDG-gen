import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long small = Integer.parseInt(input[0]);
        long large = Integer.parseInt(input[1]);
        long range = Integer.parseInt(input[2]);
        if(large - small + 1 <= range * 2){
            for(long i = small ; i <= large ; i++){
                System.out.println(i);
            }
        }
        else{
            for(long i = small ; i <= small + range -1 ; i++){
                System.out.println(i);
            }
            for(long i = large - range + 1 ; i <= large ; i++){
                System.out.println(i);
            }
        }
    }
}
