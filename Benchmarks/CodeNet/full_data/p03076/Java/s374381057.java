import java.util.*;
class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input=new int[5];
        for(int i=0;i<5;i++){
            input[i]=sc.nextInt();
        }
        int minmod=10;
        int output=0;
        for(int i=0;i<5;i++){
            output+=input[i]%10==0?input[i]:input[i]-input[i]%10+10;
            if(input[i]%10<minmod&&(input[i]%10!=0)){
                minmod=input[i]%10;
            }
        }
        System.out.println(output-10+minmod);
    }
}