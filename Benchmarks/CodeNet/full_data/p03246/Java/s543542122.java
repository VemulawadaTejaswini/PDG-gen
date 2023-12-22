import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    static double num = 380000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int odd[] = new int[(int)1e5 + 1];
        int even[] = new int[(int)1e5 + 1];
        int totalOdd = 0,totalEven = 0;
        for(int i = 0 ; i < arr.length ; i+=2){
            odd[arr[i]]++;
            totalOdd++;
        }
        ArrayList<Node> oddFreq = new ArrayList<>();
        for(int i = 0 ; i < odd.length ; i++){
            if(odd[i] > 0){
                oddFreq.add(new Node(i,odd[i]));
            }
        }
        for(int i = 1; i < arr.length ; i+=2){
            even[arr[i]]++;
            totalEven++;
        }
        ArrayList<Node> evenFreq = new ArrayList<>();
        for(int i = 0 ; i < even.length ; i++){
            if(even[i] > 0){
                evenFreq.add(new Node(i,even[i]));
            }
        }
        Collections.sort(oddFreq);
        Collections.sort(evenFreq);
        int oddNum = 0;
        int evenNum = 0;
        if(oddFreq.get(0).num == evenFreq.get(0).num){
            int firstOdd = oddFreq.get(0).count;
            int secondOdd = oddFreq.size() > 1 ? oddFreq.get(1).count : 0;
            int firstEven = evenFreq.get(0).count;
            int secondEven = evenFreq.size() > 1 ? evenFreq.get(1).count : 0;

            int ans1 = totalEven+totalOdd - firstOdd - secondEven;
            int ans2 = totalEven + totalOdd - firstEven - secondOdd;
            System.out.println(Math.min(ans1,ans2));
            return;
        } else {
            oddNum = oddFreq.get(0).count;
            evenNum = evenFreq.get(0).count;
        }
        System.out.println(totalEven+totalOdd-oddNum-evenNum);
    }
    static class Node implements Comparable<Node>{
        int num,count;
        Node(int num , int count){
            this.num = num;
            this.count = count;
        }
        public int compareTo(Node node){
            return node.count - this.count;
        }
    }
}