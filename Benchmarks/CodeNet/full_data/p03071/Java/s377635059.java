import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int a_button=scn.nextInt();
        int b_button=scn.nextInt();
        for(int i=0;i<2;i++){
            int compare=a_button-b_button;
            if(compare>=0){
                System.out.println(a_button);
                a_button--;
            }else{
                System.out.println(b_button);
                b_button--;
            }
        }
    }
}