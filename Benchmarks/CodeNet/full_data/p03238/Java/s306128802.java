Scanner sc = new Scanner(System.in);
        char N = sc.next().charAt(0);
        if(N == '1'){
            System.out.println("Hello World");
        } else if(N == '2'){
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }