	HashSet<Integer> set = new HashSet<>();
    Scanner sc = new Scanner (System.in);
    int a = sc.nextInt(); 
    int b = sc.nextInt(); 
    int c = sc.nextInt();
    set.add(a); 
    set.add(b); 
    set.add(c);  
    if (set.size() == 2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

