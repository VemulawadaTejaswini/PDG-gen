import java.util.Scanner;
import java.util.ArrayList;

class Main{
    static ArrayList<Integer> caps = new ArrayList<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int camelNum = sc.nextInt();
        String result = "Yes";

        for(int i = 0; i < camelNum; i++){
            caps.add(sc.nextInt());
        }

        ArrayList<Integer> tmpList = new ArrayList<>();
        for(int i = 0; i < camelNum; i++){
            tmpList.add(caps.get(i));
        }
        //初期点の組み合わせ
        loop: for(int j = 0; j < camelNum; j++){
            for(int k = j+1; k < camelNum; k++){
                swap(caps.indexOf(tmpList.get(j)), 0);
                swap(caps.indexOf(tmpList.get(k)), 1);
                //1周
                for(int i = 0; i < camelNum-2; i++){
                    int left = caps.get(i);
                    int right = caps.get(i+1);
                    int xor = left ^ right;
                    int index;
                    if((index = caps.indexOf(xor)) > -1){
                        swap(i+2, index);
                    }else{
                        result = "No";
                        break loop;
                    }
                }
                if(result == "Yes")break;
            }
        }

        System.out.println(result);
    }

    static void swap(int i, int j){
        int tmp = caps.get(i);
        caps.set(i,caps.get(j));
        caps.set(j,tmp);
    }
}