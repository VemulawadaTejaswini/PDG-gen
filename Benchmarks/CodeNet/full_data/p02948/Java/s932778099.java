import java.util.Arrays;
import java.util.Scanner;

class Main {

    static class node implements Comparable<node>{
        int days;
        int money;

        public int compareTo(node o) {
            if(this.money==o.money){
                return o.days-this.days;
            }
            return -(this.money-o.money);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int day = in.nextInt();

        node n[] = new node[t];

        for(int i=0;i<t;i++){
            int x = in.nextInt();
            int y = in.nextInt();
            node newnode = new node();
            newnode.days=x;
            newnode.money=y;
            n[i]=newnode;
        }

        Arrays.sort(n);

//        for(int i=0;i<t;i++){
//            System.out.println(n[i].days+" "+n[i].money);
//        }

        System.out.println(returnAns(n,day));

    }

    public static int returnAns(node[] n,int day){
        int ans =0;

        int days = day;

        for(int i=0;i<n.length;i++){

//            System.out.println(i-1);
            if(n[i].days-(days-i)<=0 ){
                ans += n[i].money;
            }
        }

        return ans;
    }
}
