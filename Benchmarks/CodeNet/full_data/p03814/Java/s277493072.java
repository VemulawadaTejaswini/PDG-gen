import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int length=str.length();
        int i,j;
        for(i=0;i<length;i++){
            if(str.charAt(i)=='A'){
                break;
            }
        }
        for(j=length-1;0<j;j--){
            if(str.charAt(j)=='Z'){
                break;
            }
        }
        int k=j-i+1;
        System.out.println(k);
    }
}