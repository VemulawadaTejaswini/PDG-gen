import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArraySub = str.split(" ");
        int suu = strArraySub.length;
        //System.out.println(strArraySub[0]);
        int num[] = new int[suu];
        for(int i=0;i<strArraySub.length;i++){
            num[i]=Integer.parseInt(strArraySub[i]);
        }
        int k = num[1]-num[0];
        int m = num[1];
        
        for(int j=k;j>0;j--){
            m = m-j;
            //System.out.println(m);
        }
        m = -m;
        System.out.println(m);
    }
}