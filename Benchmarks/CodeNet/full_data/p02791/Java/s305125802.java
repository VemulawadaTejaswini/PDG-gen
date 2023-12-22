import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int count =0;
        for(int i = 0;i<n;i++){
            int tmp = sc.nextInt();
            list.add(tmp);
            Collections.sort(list);
            if(tmp==list.get(0)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
