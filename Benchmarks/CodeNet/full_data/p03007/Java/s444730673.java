import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i=0; i<N; i++){
            A.add(sc.nextInt());
        }
        sc.close();

        int min,max,tmp;
        ArrayList<Integer> Z = new ArrayList<>();
        int i=0;
        while (A.size() != 2){
            Collections.sort(A);
            min = A.get(0);
            max = A.get(1);
            Z.add(min);
            Z.add(max);
            tmp = min - max;

//            System.out.println("A List");
//            for(int k=0; k<A.size(); k++){
//                System.out.print(A.get(k) + " ");
//            }
//            System.out.println();

            A.remove(0);
            A.remove(0);
            A.add(tmp);
            i = i+2;

//            System.out.println("A List");
//            for(int k=0; k<A.size(); k++){
//                System.out.print(A.get(k) + " ");
//            }
//            System.out.println();
//
        }
        Collections.sort(A);
        min = A.get(0);

//        System.out.println("A:"+A.size());
//        System.out.println("A List");
//        for(int k=0; k<A.size(); k++){
//            System.out.print(A.get(k) + " ");
//        }
//        System.out.println();


        max = A.get(A.size()-1);

        System.out.println(max-min);

//        System.out.println("Z:"+Z.size());
        for (int j=0; j<Z.size()-1; j=j+2){
            System.out.println(Z.get(j)+" "+Z.get(j+1));
        }
        System.out.println(max+" "+min);
    }
}