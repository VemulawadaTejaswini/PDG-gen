import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean loop = false;
        list.add(s);
        int i = 1;
        while(!loop){
            int j = list.get(i-1);
            if(j%2==0){
                if(list.contains(j/2)){
                    break;
                }
                list.add(j/2);
            } else {
                if(list.contains(j*3+1)){
                    break;
                }
                list.add(j*3+1);
            }
            i ++;
        }
        System.out.println(i+1);
    }
}