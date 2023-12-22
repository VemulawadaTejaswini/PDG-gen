import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        ArrayList<Integer> Aarray = new ArrayList<>();
        ArrayList<Integer> Barray = new ArrayList<>();
        ArrayList<Integer> Carray = new ArrayList<>();

//        Integer[] Aarray = new Integer[a];
////        Integer[] Barray = new Integer[b];
////        Integer[] Carray = new Integer[c];
////
//        for (int i = 0; i < a; i++){
//            Aarray[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < b; i++){
//            Barray[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < c; i++){
//            Carray[i] = scanner.nextInt();
//        }

        for (int i = 0; i < a; i++){
            Aarray.add(scanner.nextInt());
        }
        for (int i = 0; i < b; i++){
            Barray.add(scanner.nextInt());
        }
        for (int i = 0; i < c; i++){
            Carray.add(scanner.nextInt());
        }

//        Arrays.sort(Aarray, Collections.reverseOrder());
//        Arrays.sort(Barray, Collections.reverseOrder());
//        Arrays.sort(Carray, Collections.reverseOrder());

        Collections.sort(Aarray, Collections.reverseOrder());
        Collections.sort(Barray, Collections.reverseOrder());
        Collections.sort(Carray, Collections.reverseOrder());

        int result = 0;
        while (Aarray.get(0) >= Carray.get(0)){
            if (x > 0){
                result += Aarray.get(0);
                Aarray.remove(0);
                x --;
                if (x == 0){
                    break;
                }
            }
        }
        while (Barray.get(0) >= Carray.get(0)){
            if (y > 0){
                result += Barray.get(0);
                Barray.remove(0);
                y --;
                if (y == 0){
                    break;
                }
            }
        }

        while ((x+y) > 0){
            if (x >= 1 && y >= 1){
                if (Aarray.get(0) >= Carray.get(0)){
                    result += Aarray.get(0);
                    Aarray.remove(0);
                    x --;
                    continue;
                }
                if (Barray.get(0) >= Carray.get(0)){
                    result += Barray.get(0);
                    Barray.remove(0);
                    y --;
                    continue;
                }

                //上記に引っかからなかった時
                if (Aarray.get(0) > Barray.get(0)){
                    result += Carray.get(0);
                    Carray.remove(0);
                    y--;
                    continue;
                }else if (Aarray.get(0) < Barray.get(0)){
                    result += Carray.get(0);
                    Carray.remove(0);
                    x--;
                    continue;
                }else {
                    //同じ
                    if (x == 1){
                        result += Carray.get(0);
                        Carray.remove(0);
                        y--;
                        continue;
                    }

                    if (y == 1){
                        result += Carray.get(0);
                        Carray.remove(0);
                        x--;
                        continue;
                    }


                    if (x > y){
                        result += Carray.get(0);
                        Carray.remove(0);
                        x--;
                        continue;
                    }else if (x < y){
                        result += Carray.get(0);
                        Carray.remove(0);
                        y--;
                        continue;
                    }else {
                        result += Carray.get(0);
                        Carray.remove(0);
                        x--;
                        continue;
                    }
                }
            }else if (x >= 1){
                result += Carray.get(0);
                Carray.remove(0);
                x--;
            }else if (y >= 1){
                result += Carray.get(0);
                Carray.remove(0);
                y--;
            }
        }

        System.out.println(result);
    }
}