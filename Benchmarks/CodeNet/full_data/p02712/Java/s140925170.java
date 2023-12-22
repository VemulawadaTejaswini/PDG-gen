import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int x=stdIn.nextInt();
        double sum=0;
        for(int i=1; i<=x; i++){
            if(i%5!=0&&i%3!=0){
                sum+=i;
            }
        }
        System.out.println(sum);
        
        
    }

}