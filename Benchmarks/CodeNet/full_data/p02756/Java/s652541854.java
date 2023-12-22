import java.util.*;

class Main{
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length; i++){
            list.add(s[i]);
        }
        int q = sc.nextInt();
        int dir = 0;
        for(int i = 0; i < q; i++){
            int op = sc.nextInt();
            if(op == 1){
                dir++;
            }else{
                int end = sc.nextInt();
                char let = sc.next().charAt(0);
                if((dir + end) % 2 == 0){
                    list.add(let);
                }else{
                    list.add(0, let);
                }
            }
        }
        if(dir % 2 == 0){
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.toArray()[i]);
            }
        }else{
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.toArray()[list.size() - 1 - i]);
            }
        }
    }
}