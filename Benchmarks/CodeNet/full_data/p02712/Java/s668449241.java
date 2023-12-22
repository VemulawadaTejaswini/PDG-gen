import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        List<Integer> intList1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();

        for(int i=1;i<=n;i++){
            intList1.add(i);
        }

        //System.out.println(intList1);


            for(int i=1;i<=n;i++){
                if (i % 3 == 0) {
                    list2.add(i);
                }
                else
                if (i % 5 == 0) {
                    list2.add(i);


                }else
                    if (i % 5 == 0 && i % 3 == 0) {
                    list2.add(i);

                }

            }
            //System.out.println(list2);
            for(Integer test:intList1){
                a=test+a;
            }
            for(Integer test2:list2){
            b=test2+b;
        }
        System.out.println(a-b);
        }


}

