import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
            String str=scan.next();
            if(str.charAt(0)!='A'){
                System.out.println("WA");
                return;
            }
            else{
                int Ccount=0;
                int i;
                int length=str.length();
                for(i=2;i<length-1;i++){
                    if(str.charAt(i)=='C'){
                        Ccount++;
                    }
                    if(Ccount>1){
                        System.out.println("WA");
                        return ;
                    }
                }
                if(Ccount==0){
                    System.out.println("WA");
                    return ;
                }
                int big=0;
                for(i=0;i<length;i++){
                    if(Character.isUpperCase(str.charAt(i))){
                        big++;
                        if(big>2){
                            System.out.println("WA");
                            return ;
                        }
                    }
                }
            }
            System.out.println("AC");
    }
}