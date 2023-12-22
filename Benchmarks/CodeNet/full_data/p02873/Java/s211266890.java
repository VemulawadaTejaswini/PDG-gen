import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int[] num = new int[c.length+1];
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        int sum = 0;

        for(int i = 0;i < c.length;i++){
            int cnt = 1;
            for(int j = i;j < c.length-1;j++){
                if(c[j] != c[j+1]){
                    cnt++;
                }else{
                    if(c[j] == '<' && c[j+1] == '>')
                    
                    break;
                }
            }
            list.add(cnt);
        }

        boolean[] ud = new boolean[list.size()];

        for(int i = 0;i <ud.length;i++){
            int tmp = 0;
            for(int j = index;j < c.length-1;j++){
                tmp++;
                if(c[j] == '<' && c[j+1] == '>'){
                    ud[i+1] = true;
                    break;
                }
            }
            index = tmp;
        }
        if(c[0] != 1){
            sum += num[0];
        }
        for(int i = 0;i < list.size();i++){
            if(ud[i] == false){
                sum += wa(list.get(i));
            }else{
                sum += wa(list.get(i)-1);
            }
        }

        System.out.println(sum-1);
    }

    public static int wa(int num){
        int sum = 0;
        for(int i = num;i >= 0;i--)
            sum += i;

        return sum;
    }
}