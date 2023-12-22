import java.util.*;

class Main{
    public static void main(String[] args){
        ArrayList<Integer> listA = new ArrayList<Integer>();
        ArrayList<Integer> listB = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        String[] strArray = str.split("");
        for(int i = 0;i < n;i++){
            listA.add(Integer.parseInt(strArray[i]));
        }
        scan.close();

        while(true){
            if(listA.size() != 0){
                for(int i = 0 ; i < listA.size() - 1; i++){
                    listB.add(Math.abs(listA.get(i) - listA.get(i+1)));
                }
                listA.clear();
            } else {
                for(int i = 0 ; i < listB.size() - 1; i++){
                    listA.add(Math.abs(listB.get(i) - listB.get(i+1)));
                }
                listB.clear();
            }

            //終了条件
            if(listA.size() == 1 || listB.size() == 1) break;
        }

        if(listA.size() == 1) System.out.println(listA.get(0));
        else System.out.println(listB.get(0));
    }
}