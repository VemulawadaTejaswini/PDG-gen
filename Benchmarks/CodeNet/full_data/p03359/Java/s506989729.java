import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] in = sc.nextLine().split(" ");
        Integer a = Integer.parseInt(in[0]);
        Integer b = Integer.parseInt(in[1]);
        Integer i;
        if(a<b){
            i = a;
        }else {
            i = a-1;
        }
        System.out.println(i.toString());
    }

}