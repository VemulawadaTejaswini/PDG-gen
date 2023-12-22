
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean flag = false;
        List<String> lst = new ArrayList();
        int countA=0,countB=0;


        if (S.length() != 4) {
            flag = false;
        } else {
            for (int i = 0; i < S.length(); i++) {
                if (!lst.contains(S.substring(i, i + 1))) {
                    lst.add(S.substring(i, i + 1));

                }


            }

            if(lst.size()!=2){
                flag=false;
            }else{

                for (int i = 0; i < S.length(); i++) {
                    if (S.substring(i,i+1).equals((String)lst.get(0))) {
                       countA++;

                    }else if (S.substring(i,i+1).equals((String)lst.get(1))) {
                        countB++;
                    }


                }

                if(countA==countB&&countA==2){
                    flag=true;
                }else{
                    flag=false;
                }

            }



        }

        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }



    }
}

