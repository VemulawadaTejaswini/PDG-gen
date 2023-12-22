import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++) {
            list.add(sc.nextInt());
        }
        int count = 0;
        boolean isContinue = true;

        ArrayList<Integer> numberSubList = list;
        while(isContinue) {
            ArrayList<Integer> numberSubSubList = new ArrayList<>();
            for(int number : numberSubList) {
                if(number % 2 == 0) {
                    numberSubSubList.add(number / 2);
                } else {
                    isContinue = false;
                    break;

                }

            }

            if(isContinue) {
                count++;
                numberSubList = new ArrayList<>(numberSubSubList);
            }

        }

        System.out.println(count);
    }
}