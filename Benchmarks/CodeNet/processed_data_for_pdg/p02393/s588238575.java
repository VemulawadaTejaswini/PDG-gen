class Main{
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int input_one = scanner.nextInt();
    int input_two = scanner.nextInt();
    int input_three = scanner.nextInt();
    if(input_one > input_two){
    int kari = input_one;
    input_one = input_two;
    input_two = kari;
    }
    if(input_two > input_three){
    int karxi = input_two;
    input_two = input_three;
    input_three = karxi;
    }
    if(input_one > input_two){
    int kari = input_one;
    input_one = input_two;
    input_two = kari;
    }
    System.out.println(input_one + " " +input_two + " " + input_three);
    }
}
