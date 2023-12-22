import java.util.*;
public class Main{
    public static void main(String[] args)throws Exception{
        Scanner sc = new Scanner(System.in);

        int[] array = new int[3];

        for(int i = 0;i < 3;i++){
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

//        for(int i = 0;i<3;i++){
//            System.out.print(array[i]+" ");
//            if(i == 3-1)
//                System.out.println("");
//        }

        System.out.println(array[2] * 10 + array[1] + array[0]);
    }
}