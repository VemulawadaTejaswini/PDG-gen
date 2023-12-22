Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.next();
        String s = sc.nextLine();
        for (int i = 0; i < q; i++) {
            int lo = sc.nextInt();
            int hi = sc.nextInt();
            String temp = s.substring(lo - 1, hi);
            int count = 0, index = -1;
            while (index < n) {
                index = temp.indexOf("AC", index);
                if (index < 0) {
                    break;
                } else {
                    index += 2;
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();