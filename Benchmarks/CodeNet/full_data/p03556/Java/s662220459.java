import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int intInput = sc.nextInt();

        int count = 1;
        while (count * count <= intInput){
            count ++;
        }
        count --;

        System.out.println(count * count);
    }
}