import java.util.Scanner;
import java.util.ArrayList;
class Main{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int s=scn.nextInt();
        ArrayList<Integer> element=new ArrayList<Integer>();
        for(int i=1;;){
            if(i==1){
                element.add(s);
            }else{
                if(s%2==1){
                    s=odd(s);
                }else{
                    s=even(s);
                }
                if(element.indexOf(s)==-1){
                    element.add(s);
                }else{
                    System.out.println(i);
                    break;
                }
            }
            i++;
        }
    }
    public static int even(int n){
        return n/2;
    }
    public static int odd(int n){
        return 3*n+1;
    }
}
