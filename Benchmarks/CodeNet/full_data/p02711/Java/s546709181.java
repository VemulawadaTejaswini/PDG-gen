import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean judge = false;

        for(int i=0;i<3;i++){
            double a = N/Math.pow(10.0,2.0-i);
            int n = (int)Math.floor(a);
            if(n==7){
                judge = true;
                break;
            }else{
                N -= n*Math.pow(10.0,2.0-i);
            }
        }
        if(judge==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}