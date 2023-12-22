import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int date=stdIn.nextInt();
        int homework=stdIn.nextInt();
        System.out.println();

        int [] a=new int[homework];
        for(int i=0; i<homework; i++){
            a[i]=stdIn.nextInt();
        }
        int sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
        }
        int free=date-sum;
        if(free>=0){
        System.out.print(free);
        }
        else{
            System.out.print(-1);
            
        }
    }

}