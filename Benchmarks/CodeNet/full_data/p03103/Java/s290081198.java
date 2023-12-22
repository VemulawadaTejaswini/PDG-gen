import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long M = sc.nextLong();
        long opt =0;
        ArrayList<Drink> List = new ArrayList<>();
        for(int a=0;a<N;a++){
            long price = sc.nextLong();
            long count = sc.nextLong();
            Drink d = new Drink(price,count);
            List.add(d);
        }
        Collections.sort(List, new Comparator<Drink>() {
            @Override
            public int compare(Drink o1, Drink o2) {
                return o1.price<o2.price ? -1:1;
            }
        });

        for(Drink d:List){
            if(M-d.count>0){
                M=M-d.count;
                opt+=d.count*d.price;
            }
            else if(M-d.count<=0){
                opt+=d.price*M;
                break;
            }
        }
        System.out.println(opt);
    }
}

class Drink{
    long price;
    long count;
    public Drink(long price,long count){
        this.price = price;
        this.count = count;
    }
}