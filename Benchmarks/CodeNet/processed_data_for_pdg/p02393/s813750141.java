public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        String[] strArray = input.split(" ");
        int num1 = Integer.parseInt(strArray[0]);
        int num2 = Integer.parseInt(strArray[1]);
        int num3 = Integer.parseInt(strArray[2]);
        int changeBox;
        if(num2 < num1){
            changeBox = num1;
            num1 = num2;
            num2 = changeBox;
        }
        if(num3 < num2){
            changeBox = num2;
            num2 = num3;
            num3 = changeBox;
        }
        if(num2 < num1){
            changeBox = num1;
            num1 = num2;
            num2 = changeBox;
        }
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}
