import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        int a=0,b=0;
        int suma=0,sumb=0;
        int min=100;

        for(int i = 1 ; i <= n/2 ;i++){
            a=i;
            b=n-i;
   //         System.out.println("a: "+ a + "  b:"+ b);
            while(a/10 != 0){
                suma = suma + a %10;
                a = a / 10;
            }
            while(b/10!=0){
                sumb = sumb + b %10;
                b = b / 10;
            }
            suma = suma +a %10;
            sumb = sumb +b %10;

            if(min > suma+sumb){
                min = suma+sumb;
            }
    //        System.out.println("suma: "+ suma + "  sumb:"+ sumb);
            suma = 0;
            sumb = 0;
        }
        System.out.println(min);
    }
}
