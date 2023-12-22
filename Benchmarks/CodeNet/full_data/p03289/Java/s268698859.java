import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S= sc.next();
        byte[] ascii;
        int countA=0;
        int countC=0;
        int Omoji=0;
        try{
            ascii =S.getBytes("US-ASCII");
        }catch(Exception e){
            e.printStackTrace();
            return;
        }
        int a=ascii[0];
        int c = ascii[2];
        if(a==65)countA++;
        for(int i=0;i<ascii.length;i++){
            int b=ascii[i];
            if(b>=65&&b<=90)Omoji++;
            if(b==67&&i<=ascii.length-2&&i!=1)countC++;
        }
        if(countA==1&&countC==1&&Omoji==2)System.out.println("AC");
        else System.out.println("WA");
    }
}