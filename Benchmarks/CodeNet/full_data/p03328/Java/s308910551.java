import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt();
        int[] aa = new int[10000];
        aa[1]=1;
        for (int i=2;i<aa.length;i++) {
            aa[i] = aa[i - 1] + i;
//            System.out.println(aa[i]);
        }
        int diff = b-a;
        boolean chk=false;
        int len1=0,len2=0;
        for (int i=2;i<aa.length;i++){
            if(aa[i]-aa[i-1]==diff){
                chk=true;
                len1=aa[i-1];
                len2=aa[i];
                break;
            }
        }
        System.out.print(chk?Math.abs(len2-b):1);
    }
}
