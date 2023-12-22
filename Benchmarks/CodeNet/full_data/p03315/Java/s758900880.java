import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        String b = "+";
        String c = "-";
		int takahashi = 0;

           if(b.equals(a)) {
            ++takahashi;
           } else if(c.equals(a)) {
            --takahashi;
           } else{

           }
           System.out.println(takahashi);


        }
    }

