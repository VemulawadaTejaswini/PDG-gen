import java.util.Scanner;

public class Main {
    public int sortNum = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        sort(array);

        if(sortNum <= 1){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public void sort(int[] array){
        for(int i = 0; i < array.length; i++ ){
            int index = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[index]){
                    index = j;
                }
            }
            if(i != index){
                int tmp = array[index];
                array[index] = array[i];
                array[i] = tmp;
                sortNum++;
            }
        }
    }
}
