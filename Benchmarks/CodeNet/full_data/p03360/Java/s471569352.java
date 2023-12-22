import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] array = str.split(" ");
        int size = array.length;
        int[] num = new int[size];
        int[] num2 = new int[size];
        int[] num3 = new int[size];
        for(int i=0;i<array.length;i++){
            num[i]=Integer.parseInt(array[i]);
            num3[i]=num[i];

        }
        int suu =sc.nextInt();
        int max = 0;
        
        if(suu!=1){
            for(int i=0;i<suu;i++){
                num2[0]=num3[0]*2+num[1]+num[2];
                num3[0]=num3[0]*2;
                num2[1]=num[0]+num3[1]*2+num[2];
                num3[1]=num3[1]*2;
                num2[2]=num[0]+num[1]+num3[2]*2;
                num3[2]=num3[2]*2;
            }
            for(int k=0;k<num2.length;k++){
                max=Math.max(max, num2[k]);
            }
        }else{
            num2[0]=num[0]*2+num[1]+num[2];
            num2[1]=num[0]+num[1]*2+num[2];
            num2[2]=num[0]+num[1]+num[2]*2;
            for(int k=0;k<num2.length;k++){
                max=Math.max(max, num2[k]);
            }
            
        }
        System.out.println(max);
    }
}