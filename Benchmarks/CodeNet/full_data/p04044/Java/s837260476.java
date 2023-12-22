import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner inpunt = new Scanner(System.in);
        int x ,y ;
        String result="";

        x=inpunt.nextInt();
        y=inpunt.nextInt();
        inpunt.nextLine();
        String[] array = new String[y];
        for(int i=0;i<y;i++){
           array[i]=inpunt.nextLine();
        }

        for(int i = 0; i < y-1; ++i) {
            for (int j = i + 1; j < y; ++j) {
                if (array[i].compareTo(array[j]) > 0) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int i=0;i<y;i++){
            result += array[i];
        }

        System.out.println(result);



    }
}