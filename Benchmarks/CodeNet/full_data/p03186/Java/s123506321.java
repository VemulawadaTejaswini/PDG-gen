import java.util.Scanner;

class poison_cookie{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int gedoku1 = scanner.nextInt();
        int gedoku2 = scanner.nextInt();
        int poison_cookie = scanner.nextInt();
        int poison_flag = 0;
        int delicious_count = 0;
        int i = 0;

        while(true){
            if(poison_flag == 0){
                if(poison_cookie != 0){
                    poison_cookie -= 1;
                    delicious_count += 1;
                    poison_flag = 1;
                    continue;
                }else if(gedoku2 != 0){
                    gedoku2 -= 1;
                    delicious_count += 1;
                    poison_flag = 0;
                    continue;
                }else if(gedoku1 != 0){
                    gedoku1 -= 1;
                    poison_flag = 0;
                    continue;
                }else{
                    break;
                }
            }

            if(poison_flag == 1){
                if(gedoku2 != 0){
                    gedoku2 -= 1;
                    delicious_count += 1;
                    poison_flag = 0;
                    continue;
                }else if(gedoku1 != 0){
                    gedoku1 -= 1;
                    poison_flag = 0;
                    continue;
                }else{
                    break;
                }
            }
            i++;
        }
        System.out.println(delicious_count);
        scanner.close();
    }
}