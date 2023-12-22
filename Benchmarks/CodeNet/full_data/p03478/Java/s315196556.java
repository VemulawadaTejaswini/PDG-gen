public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;

        for(int i = 1 ; i <= n; i++){
            int sum = findSumOfDigits(i);
            if(sum >= a && sum <= b){
                result += i;
            }
        }

        System.out.println(result);
    }

    public static int findSumOfDigits(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }