import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String input = sn.next();
        String[] str=new String[2];
        str[0]= input.charAt(0)+""+input.charAt(1)+"";
        str[1]= input.charAt(2)+""+input.charAt(3)+"";
        int[] deta = new int[2];
        deta[0]= Integer.parseInt(str[0]);
        deta[1]= Integer.parseInt(str[1]);
        int count=0;
        boolean flag=false;
        for(int i=0;i<2;i++){
            if (deta[i]>0&&deta[i]<=12) {
                count++;
                if (i==0){
                    flag=true;
                }
            }
        }
        if(count==0){
            System.out.println("NA");
        }else if (count==2){
            System.out.println("AMBIGUOUS");
        }else if(count==1){
            if(flag){
                System.out.println("MMYY");
            }else{
                System.out.println("YYMM");
            }
        }


    }
}
