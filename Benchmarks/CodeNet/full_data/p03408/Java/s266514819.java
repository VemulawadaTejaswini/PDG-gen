import java.util.*;

class Main{
    public static void main(String[] args){
        int tmp = -1;
        Scanner sc = new Scanner(System.in);

        int bnum = sc.nextInt();
        String[] bstr = new String[bnum];
        for(int i=0;i<bnum;i++){
            bstr[i]=sc.next();
        }
        int rnum = sc.nextInt();
        String[] rstr  =new String[rnum];
        for(int i=0;i<rnum;i++){
            rstr[i]=sc.next();
        }
        sc.close();

        for(int i=0;i<bnum;i++){
            for(int j=0;j<bnum;j++){
                tmp += (bstr[i]==bstr[j])?1:0;
            }
            for(int j=0;j<rnum;j++){
                tmp += (bstr[i]==rstr[j])?-1:0;
            }
        }
        int max = Math.max(0,tmp);
        System.out.print(max);
    }
}