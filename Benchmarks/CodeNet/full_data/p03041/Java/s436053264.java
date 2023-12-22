Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String a = sc.next();
    String A = "A";
    String B = "B";
    String C = "C";
    if(a.charAt(K).equals(A)){
      a.replace(K,"a");
    }else if(a.charAt(K).equals(B)){
      a.replace(K,"b");
    }else if(a.charAt(K).equals(C)){
      a.replace(K,"c");
    }
    System.out.println(a);