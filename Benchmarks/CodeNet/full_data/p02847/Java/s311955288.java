import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String[] arr = {"MON","TUE","WED","THU","FRI","SAT","SUN"};
        int i;
        String s;
        i=0;
        s=scan.next();
        while(! s.equals(arr[i])){
            i+=1;
        }
        if(6-i==0) System.out.println(7);
        else System.out.println(6-i);
    }
}