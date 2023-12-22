import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int targetSum = sc.nextInt();
        int[] usedMoneyArray;

        Eager eager = new Eager(num, targetSum);
        usedMoneyArray = eager.getMoneyArray();

        for(int i=0; i<usedMoneyArray.length; i++){
            if(i == 2){
                System.out.println(usedMoneyArray[i]);
            } else {
                System.out.print(String.format("%d ", usedMoneyArray[i]));
            }
        }
    }
}

class Eager{
    private int num;
    private int targetSum;
    private int sum = 0;
    private int[] usedMoneyArray = {0, 0, 0};

    Eager(int num, int targetSum){
        this.num = num;
        this.targetSum = targetSum;
    }

    public int[] getMoneyArray(){
        loop: for(int i=num; i>=0; i--){
            for(int j=num-i; j>=0; j--){
                int k = num -i - j;
                if((i+j+k) != num || i < 0 || j < 0 || k < 0){
                    continue;
                } else {
                    int total = i*10000 + j*5000 + k*1000;
                    if(total == targetSum){
                        usedMoneyArray[0] = i;
                        usedMoneyArray[1] = j;
                        usedMoneyArray[2] = k;

                        return usedMoneyArray;
                    }
                }
            }
        }
        usedMoneyArray[0] = -1;
        usedMoneyArray[1] = -1;
        usedMoneyArray[2] = -1;
        return usedMoneyArray;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTargetSum(int targetSum) {
        this.targetSum = targetSum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setUsedMoneyArray(int[] usedMoneyArray) {
        this.usedMoneyArray = usedMoneyArray;
    }
}