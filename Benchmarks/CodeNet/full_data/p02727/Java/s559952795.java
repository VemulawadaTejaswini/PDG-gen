import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arrA = new int[a];
        int[] arrB = new int[b];
        int[] arrC = new int[c];
        for(int i = 0; i < a; i++)
        	arrA[i] = sc.nextInt();
        for(int i = 0; i < b; i++)
        	arrB[i] = sc.nextInt();
    	for(int i = 0; i < c; i++)
        	arrC[i] = sc.nextInt();
        Arrays.sort(arrA); Arrays.sort(arrB); Arrays.sort(arrC);
        long sum = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = a - x; i < a; i++) {
        	sum += arrA[i];
        	list.add(arrA[i]);
        }
        for(int i = b - y; i < b; i++) {
        	sum += arrB[i];
        	list.add(arrB[i]);
        }
        Collections.sort(list);

        for(int i = 0, idxC = c - 1; i < list.size() && idxC >= 0; i++) {
            if(arrC[idxC] == list.get(i)) continue;
            else if (arrC[idxC] > list.get(i)) {
                sum -= list.get(i);
        		sum += arrC[idxC--];
            } else {
                break;
            }
        }
        System.out.println(sum);
    }
}
