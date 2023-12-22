import java.util.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        sc.nextLine();
        List<String> strA=new ArrayList<String>();


        for(int i=0;i<a;i++){
            strA.add(sc.nextLine());
        }

        boolean flag=true;

        for(int i=0;i<b;i++){

            String bStr=sc.nextLine().trim();

            if(strA.size()==0 && bStr.length()!=0){
                break;
            }

            boolean isExist=false;
            for(String str:strA){
                if(str.contains(bStr)){
                    isExist=true;
                    break;
                }
            }

            flag=flag&&isExist;

            if(!flag){
                break;
            }
        }

        if(!flag) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}