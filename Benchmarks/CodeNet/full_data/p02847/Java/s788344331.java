import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String[] arr = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        int i;
        String s;
        i=0;
        s=scan.next();
        while(! s.equals(arr[i])){
            i+=1;
        }
        if(i==6) System.out.println(arr[0]);
        else System.out.println(arr[i+1]);
    }
}