
import java.util.Arrays;
import java.util.Scanner;

class Main {


    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }

    public static char check(char n,int [] arr){
        if (! contains(arr,Character.getNumericValue(n)))
            return n;
        else{
            n+=1;
            return(check(n,arr));
        }

    }
    public static void main(String[] args) {

        Scanner inpunt = new Scanner(System.in);
        int x ,y ;
        String result = "";

        x=inpunt.nextInt();
        y=inpunt.nextInt();
        inpunt.nextLine();
        int array[] = new int[y];

        for(int i=0;i<y;i++){
           array[i]=inpunt.nextInt();

        }


            String str1 = Integer.toString(x);
            for(int i=0;i<str1.length();i++){
                result += check(str1.charAt(i),array);
            }

        System.out.println(result);


    }
}