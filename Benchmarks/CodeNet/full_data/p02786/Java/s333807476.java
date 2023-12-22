import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> h = new ArrayList<Integer>();
        h.add(scan.nextInt());
        int count = 0;
        scan.close();

        while(!h.isEmpty()){
            int hp = h.get(0);
            h.remove(0);
            if(hp != 1){
                hp = hp / 2;
                h.add(hp);
                h.add(hp);
            }
            count++;
        }

        System.out.println(count);
    }


}