import java.util.Scanner;
class Main{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int[] num= new int[3];
        int max = 0;
        int maxNum = 0;
        for(int i=0;i<3;i++){
            num[i]=scn.nextInt();
            if(max<num[i]){
                max = num[i];
                maxNum=i;
            }
        }
        int k = scn.nextInt();
        int answer = 0;
        for(int i=0;i<3;i++){
            if(maxNum==i){
                max *= Math.pow(2,k);
                answer += max;
            }else{
                answer+=num[i];
            }
        }
        System.out.println(answer);
    }
}