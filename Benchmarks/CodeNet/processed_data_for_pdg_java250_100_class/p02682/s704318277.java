public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int[] numList = new int[3];
         for (int i = 0; i < numList.length; i++) {
             numList[i] = sc.nextInt();
         }
         int K = sc.nextInt();
         sc.close();
         int count = 0;
         int cardNum = 1;
         for (int num : numList) {
             if (num > 0) {
                 if (num > K) {
                     num = K;
                 }
                 count += (cardNum * num);
                 K -= num;
                 if (K == 0) {
                     break;
                 }
             }
             cardNum--;
         }
         System.out.println(count);
    }
}
