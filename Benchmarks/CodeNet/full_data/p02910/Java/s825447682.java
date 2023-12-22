import java.util.Scanner;
class NewClass{
    public static void main(String args[]){
        Scanner scn = new  Scanner(System.in);
        String s = scn.nextLine();
        int l = s.length();boolean b = true;
        for(int i = 1; i <= l; i++){
            char ch = s.charAt(i-1);
            if(i%2==0&&ch=='R'){
                b = false;break;
            }else if(i%2==1&&ch=='L'){
                b=false;break;
            }
        }
        System.out.println(b?"YES":"NO");
    }
}