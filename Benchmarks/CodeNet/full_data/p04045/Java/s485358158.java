import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        List<Integer> excNumbers = new ArrayList<Integer>();

        Scanner in = new Scanner(System.in);
        int n, k;
        n = in.nextInt();
        k = in.nextInt();
        int x = n;
        int y = 0;
        in.nextLine();
        for (int i = 0; i< k ; i++){
            excNumbers.add(in.nextInt());
        }
        String n1 = Integer.toString(n);
        boolean flag = false ;
        if(excNumbers.size() < 10){
            for (int j = 0 ;j<n1.length();j++){

                if(excNumbers.contains(Integer.parseInt(String.valueOf(n1.charAt(j))))){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.println(n);
            }
            else{
                for (int i = 0; i<= 10000 ; i++){
                    flag = false;
                    n++;
                    n1 = Integer.toString(n);
                    for (int j = 0 ;j<n1.length();j++){

                        if(excNumbers.contains(Integer.parseInt(String.valueOf(n1.charAt(j))) )){
                            flag = true;
                            break;
                        }
                    }
                    if(flag == false){
                        break;
                    }
                    y = i;
                }
//                System.out.println(flag + " "+ y);
                if(flag == false && y == 10000){
                    System.out.println(x);
                }else if(flag == false ){
                    System.out.println(n);
                }
                else {
                    System.out.println(x);

                }

            }

        }else {
            System.out.println(x);

        }


    }
}
