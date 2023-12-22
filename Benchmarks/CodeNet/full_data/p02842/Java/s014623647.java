import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //入力を受け取る
        int N = sc.nextInt();
        
        boolean judge = false;
        for(int i=1;i<=50000;i++) {
        	double pre = i*1.08;
        	if((int)pre == N) {
        		System.out.println(i);
        		judge = true;
        		break;
        	}
        }
        if (!judge) {
        	System.out.println(":(");
        }
    }
}