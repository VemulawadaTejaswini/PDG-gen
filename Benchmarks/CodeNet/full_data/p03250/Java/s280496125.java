import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int[] num=new int[3];
        int min=10;
        int max=0;
        for(int i=0;i<3;i++){
            num[i]=scn.nextInt();
            if(min>num[i]){
                min=num[i];
            }
            if(num[i]>max){
                max=num[i];
            }
        }
        int[] answer = new int[3];
        int[] check ={0,0};
        for(int i=0;i<3;i++){
            if(max==num[i]&&check[0]==0){
                answer[0]=num[i];
                check[0]++;
            }else if(min==num[i]&&check[1]==0){
                answer[2]=num[i];
                check[1]++;
            }else{
                answer[1]=num[i];
            }
        }
        String buf=String.valueOf(answer[0])+String.valueOf(answer[1]);
        System.out.println(Integer.parseInt(buf)+answer[2]);
    }
}