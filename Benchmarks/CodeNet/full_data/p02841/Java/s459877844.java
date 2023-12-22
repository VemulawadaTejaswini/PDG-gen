import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //入力を受け取る
        int M1 = sc.nextInt();
        int D1 = sc.nextInt();
        int M2 = sc.nextInt();
        int D2 = sc.nextInt();

        answer(M1,M2);
    }

    public static void answer(int A, int B){
    	if(A==B){
    		System.out.println(0);
    	}else{
    		System.out.println(1);
    		}
        }
    }