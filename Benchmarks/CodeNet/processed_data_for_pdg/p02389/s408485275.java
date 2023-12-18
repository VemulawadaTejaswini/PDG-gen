public class Main
    {
        public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                try
                    {
                        int inputA = scanner.nextInt();
                        int inputB = scanner.nextInt();
                        int area = inputA * inputB;
                        int length = (inputA + inputB) * 2;
                        System.out.println(area + " " + length);
                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください");
                        e.printStackTrace();
                    }
            }
    }
