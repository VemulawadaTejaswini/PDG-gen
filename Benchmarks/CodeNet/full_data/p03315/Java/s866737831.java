import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        String b = "+";
        String c = "-";
        int takahashi1 = 0;
        int takahashi2 = 0;
        int result = 0;

           for(;b.equals(a);takahashi1++) {
        	System.out.print(takahashi1);
           }
           for(;c.equals(a);takahashi1--) {
           	System.out.print(takahashi2);
           }
           result += takahashi1 + takahashi2;

           System.out.println(result);


        }
           }

