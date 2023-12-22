import java.util.Scanner;

public class Main {
    public Scanner in=new Scanner(System.in);
    public int[] inputNum=new int[4];
    public String outputNum;

    public static void main(String args[]){
        Main m=new Main();

        int iii=m.in.nextInt();

        m.inputNum[0]=iii/1000;
        m.inputNum[1]=(iii/100)%10;
        m.inputNum[2]=(iii/10)%10;
        m.inputNum[3]=iii%10;


        if(m.inputNum[0]+m.inputNum[1]+m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"+"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
            return;
        }
        if(m.inputNum[0]+m.inputNum[1]+m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"+"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
            return;
        }
        if(m.inputNum[0]+m.inputNum[1]-m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"-"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
            return;
        }
        if(m.inputNum[0]+m.inputNum[1]-m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"+"+m.inputNum[1]+"-"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
            return;
        }
        if(m.inputNum[0]-m.inputNum[1]+m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"+"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
            return;
        }
        if(m.inputNum[0]-m.inputNum[1]+m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"+"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
            return;
        }
        if(m.inputNum[0]-m.inputNum[1]-m.inputNum[2]+m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"-"+m.inputNum[2]+"+"+m.inputNum[3]+"=7");
            return;
        }
        if(m.inputNum[0]-m.inputNum[1]-m.inputNum[2]-m.inputNum[3]==7){
            System.out.println(m.inputNum[0]+"-"+m.inputNum[1]+"-"+m.inputNum[2]+"-"+m.inputNum[3]+"=7");
            return;
        }
    }
}
