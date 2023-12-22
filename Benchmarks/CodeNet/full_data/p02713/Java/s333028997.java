import java.util.Scanner;

class Main {

    static int gcd(int x,int y){
        while(y!=0){
            int r=x%y;
            x=y;
            y=r;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
        
        int x=stdIn.nextInt();
        System.out.println();
        int sum=0;
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                for(int k=1; k<=x; k++){
                    sum+=gcd(gcd(i,j),k);
                }
            }
        }
        System.out.println(sum);
        
        
       
        
    }

}