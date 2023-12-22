

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        String str=scanner.next();

        List<Integer> list=new ArrayList<>();
        for(int j=0;j<t;j++){
          //  int ffs=scanner.nextInt();
            list.add(j,Integer.parseInt(String.valueOf(str.charAt(j))));
        }
        while (true){
            List<Integer> ar=new ArrayList<>();
            int fl=0;
            int c=0;
            for(int j=0;j<list.size()-1;j++){
                if(Math.abs(list.get(j)-list.get(j+1))>0){
                    ar.add(c,Math.abs(list.get(j)-list.get(j+1)));
                    if(ar.get(c)>1){
                        fl=1;

                    }
                    c++;
                }
            }
            if(ar.size()==1){
                System.out.println(ar.get(0));
                break;
            }
            if(fl==0){
                System.out.println(0);
//                if(c%2==0){
//                    System.out.println(0);
//                }
//                else{
//                    System.out.println(1);
//                }
                break;
            }
            list=new ArrayList<>();
            for(int j=0;j<ar.size();j++){
                list.add(j,ar.get(j));
            }
        }

    }

}
