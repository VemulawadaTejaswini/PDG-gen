import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final Object[] Compiler = null;

    public static void main(String[] args)throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = input.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String[] array = input.readLine().split(" ");
        List<Integer> list =
            Arrays
              .stream(array)
              .map(Integer::valueOf)
              .collect(Collectors.toList());;
        long time = 0;
        if(n<k){
            System.out.println(0);
            return;
        }
        //asList(s);は固定長のlistを返す
        //List<Integer> list = Arrays.asList(hn);
        Collections.sort(list,Collections.reverseOrder());
        time = list.subList(0,k)
                   .stream()
                   .mapToInt(Integer::intValue)
                   .sum();
        System.out.println(time);
        }

    }
