import java.util.*;

public class Main {
    public static boolean debug = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Queue<Integer>[] quees = new ArrayDeque[n];
        for(int i=0;i<n;i++){
            quees[i] = new ArrayDeque<>();
            for(int j=0;j<n-1;j++) {
                quees[i].add(sc.nextInt());
            }
        }

        int count =0;
        boolean flg = true;
        while(flg){

            List<Integer> list = new ArrayList<>();
            boolean lflg = false;
            for(int i=0;i<n;i++){

                //System.out.println("i=" + i);
                if(quees[i].isEmpty()){
                    continue;
                }
                int temp = quees[i].peek();

                if(list.contains(temp)){
                    list = new ArrayList<>();
                    continue;
                }

                int temp2 = quees[temp-1].peek();
                if(temp2-1 == i){
                    quees[i].poll();
                    quees[temp-1].poll();
                    list.add(temp);
                    lflg = true;
                }
//                for(Queue<Integer> q : quees) {
//                    System.out.println(q);
//                }
            }
            flg = lflg;
            count++;



        }

        for(Queue<Integer> q : quees){
            if(!q.isEmpty()){
                System.out.println("-1");
                return;
            }
        }

        System.out.println(count);







    }

    public static void d(String message){
        if(debug){
            System.out.println(message);
        }
    }
}
