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
                flag = false;
                for (int i = 0; i< 10000 ; i++){
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
                    }else{
                        flag = false;
                    }
                }
                System.out.println(n);

            }

        }else {
            System.out.println(n);

        }


    }
}
