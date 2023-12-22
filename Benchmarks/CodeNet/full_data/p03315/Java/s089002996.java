import java.util.Scanner;

class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
		char b = '+';
    	int takahashi = 0;
		int result = 0;
    	
           if(b == a) {
            result += ++takahashi;
           } else {
            result += --takahashi;
         }
    	System.out.println(result);
        
        }
    }
