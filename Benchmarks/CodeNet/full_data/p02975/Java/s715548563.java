import java.util.*;
import java.io.*;
import java.lang.Math;
public class test{
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        //入力読み込み
        int i =0;
        int N = 3;
            while (sn.hasNextLine()) {
            String str = sn.nextLine();
            try{
                if(i ==0){
                    N = Integer.parseInt(str);
                    if(N<3 || N>1000000000){
                        System.out.println("No");
                        return;
                    }
                }else if(i==1){
                    String[] strlist = str.split(" ",0);
                    if(strlist.length != N){
                        System.out.println("No");
                        return;
                    }
                    for(int j=0; j<strlist.length; j++){
                        list.add(Integer.parseInt(strlist[j]));
                    }
                }
            }catch(Exception e){
                System.out.println("No");
                //do nothing
                return;
            }
            i++;
            if(i>1){
                break;
            }
        }     
        sn.close();  

        //logic1
        Integer[] list2 = new Integer[N];

        list2[0]=list.get(0);
        list.remove(0);
        list2[2]=list.get(0);
        list.remove(0);

        int x = list2[0]^list2[2];
        if(list.indexOf(x)== -1){
            System.out.println("No");
            return;
        }else{
            list2[1] =list.get(list.indexOf(x));
            list.remove(list.indexOf(x));
        }

        //logic2
        int listsize = list.size();
        boolean flag = false;
        for(int k = 0; k < listsize; k++){
            for(int l = 0; l < list.size(); l++){
                int temp = list2[k+2]^list.get(l);
                if(temp==list2[k+3]){
                    list2[k+4]=list.get(l);
                    list.remove(l);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.println("No");
                return;
            }else{
                flag = false;
            }
        }

        //last check
        x = list2[N-1]^list2[1];
        if( x == list2[0]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        return;
    }
}