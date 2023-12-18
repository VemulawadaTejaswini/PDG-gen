public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <3; i++){
            boolean inserted = false;
            int temp = input.nextInt();
            for(int x = 0; x < numbers.size(); x++){
                if(temp < numbers.get(x)){
                    numbers.add(x, temp);
                    inserted = true;
                    break;
                }
            }
            if(!inserted)numbers.add(temp);
        }
        for(int j = 0; j < 3 - 1; j ++){
            System.out.print(numbers.get(j) + " ");
        }
        System.out.print(numbers.get(2)+"\n");
    }}
