import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int cnt = 0;
        int index = 1;
        String prev = input.substring(0, 1);
        boolean end = true;
        while(true){

            if(String.valueOf(input.charAt(0)) != prev){
                input = input.substring(0, index - 1) + input.substring(index + 1);
                cnt += 2;
                if(input.length() == 0)break;
                index--;
                end = false;
            }

            index++;
            if(index == input.length()){
                if(end)break;
                end = true;
                index = 1;
                prev = input.substring(0, 1);
            }
        }

        System.out.println(cnt);
    }
}