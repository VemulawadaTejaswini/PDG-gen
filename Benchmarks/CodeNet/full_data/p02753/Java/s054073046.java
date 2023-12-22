import java.util.*;

public class Main{
    public static void main(String[]args){
        String[]array=new String[3];
        Scanner sc = new Scanner(System.in);
        for(int k=0;k<array.length;k++){
            array[k]=sc.next();
        }
        if(array[0].equals(array[2]) && array[1].equals(array[2]))
        System.out.println("no");
        else
        System.out.println("yes");
     }
}