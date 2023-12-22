import java.util.Scanner;

public class Main {
    public static void debug(String str){
        boolean debug = false;
        if(debug != true){
            return;
        }
        System.out.println(str);
    }
    public static void scanArray(Scanner sc ,int[] array, int num){
        for(int i =0;i<num;i++){
            array[i] = sc.nextInt();
        }
    }
    public static void main(String[] args) {

        String S;

        try (Scanner sc = new Scanner(System.in)) {
            S = sc.next();

        }
        if(S.charAt(0) == S.charAt(1) || S.charAt(1) == S.charAt(2) ||S.charAt(2) == S.charAt(3) ){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }


    }


}
