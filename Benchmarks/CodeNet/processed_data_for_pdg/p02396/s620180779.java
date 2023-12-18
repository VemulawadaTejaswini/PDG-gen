public class Main
    {
        public static void main (String[] args)
            {
                Scanner scanner = new Scanner(System.in);
                List<Integer> list = new ArrayList<Integer>();
                try
                    {
                        while (scanner.hasNextInt())
                            {
                                int tmp = scanner.nextInt();
                                if (tmp != 0)
                                    {
                                        list.add(tmp);
                                    }
                                else
                                    {
                                        break;
                                    }
                            }
                        for (int i = 0; i < list.size(); i++)
                            {
                                System.out.println("Case " + (i + 1) + ": " + list.get(i));
                            }
                    }
                catch (InputMismatchException e)
                    {
                        System.out.println("整数を入力してください");
                        e.printStackTrace();
                    }
            }
    }
