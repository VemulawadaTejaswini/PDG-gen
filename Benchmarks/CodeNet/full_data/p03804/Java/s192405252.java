import java.util.List;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by liguoxiang on 2017/02/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        sc.nextLine();
        List<String> strA=new ArrayList<>();
        List<String> strB=new ArrayList<>();

        for(int i=0;i<a;i++){
            strA.add(sc.nextLine());
        }


        for(int i=0;i<b;i++){

            strB.add(sc.nextLine().trim());
        }



        for(int i=0;i<a-b+1;i++){

            String aStr=strA.get(i);

            int index=0;
            if(aStr.contains(strB.get(0))){
                index=aStr.indexOf(strB.get(0));

                boolean isExist=true;
                for(int j=1;j<b;j++){
                    if(index==strA.get(i+j).indexOf(strB.get(j),index)){
                        continue;
                    }else{
                        isExist=false;
                        break;
                    }
                }


                if(isExist){
                    System.out.println("Yes");
                    return;
                }


            }

        }
        System.out.println("No");
    }
}