import java.util.*;

public class Main{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        System.out.println((sc.nextInt()*0+sc.nextInt()*10+sc.nextInt())%4==0?"YES":"NO");
                }
        }
}