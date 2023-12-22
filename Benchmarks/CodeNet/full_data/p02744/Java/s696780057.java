import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder ans = new StringBuilder();

        char charA = 'a';
        int intA = charA;

        for (int a = 0; a < 1; a++) {
            if (a == 0) {
                ans.append(charA);
            } else {
                ans.setCharAt(0, (char)(intA + a));
            }

            for (int b = 0; b < 2; b++) {
                if (n < 2) {
                    System.out.println(ans);
                    break;
                }
                if (b == 0) {
                    ans.append(charA);
                } else {
                    ans.setCharAt(1, (char)(intA + b));
                }
                for (int c = 0; c < 3; c++) {
                    if (n < 3) {
                        System.out.println(ans);
                        break;
                    }
                    if (c == 0) {
                        ans.append(charA);
                    } else {
                        ans.setCharAt(2, (char)(intA + c));
                    }
                    for (int d = 0; d < 4; d++) {
                        if (n < 4) {
                            System.out.println(ans);
                            break;
                        }
                        if (d == 0) {
                            ans.append(charA);
                        } else {
                            ans.setCharAt(3, (char)(intA + d));
                        }
                        for (int e = 0; e < 5; e++) {
                            if (n < 5) {
                                System.out.println(ans);
                                break;
                            }
                            if (e == 0) {
                                ans.append(charA);
                            } else {
                                ans.setCharAt(4, (char)(intA + e));
                            }
                            for (int f = 0; f < 6; f++) {
                                if (n < 6) {
                                    System.out.println(ans);
                                    break;
                                }
                                if (f == 0) {
                                    ans.append(charA);
                                } else {
                                    ans.setCharAt(5, (char)(intA + f));
                                }
                                for (int g = 0; g < 7; g++) {
                                    if (n < 7) {
                                        System.out.println(ans);
                                        break;
                                    }
                                    if (g == 0) {
                                        ans.append(charA);
                                    } else {
                                        ans.setCharAt(6, (char)(intA + g));
                                    }
                                    for (int h = 0; h < 8; h++) {
                                        if (n < 8) {
                                            System.out.println(ans);
                                            break;
                                        }
                                        if (h == 0) {
                                            ans.append(charA);
                                        } else {
                                            ans.setCharAt(7, (char)(intA + h));
                                        }
                                        for (int i = 0; i < 9; i++) {
                                            if (n < 9) {
                                                System.out.println(ans);
                                                break;
                                            }
                                            if (i == 0) {
                                                ans.append(charA);
                                            } else {
                                                ans.setCharAt(8, (char)(intA + i));
                                            }
                                            for (int j = 0; j < 10; j++) {
                                                if (n < 10) {
                                                    System.out.println(ans);
                                                    break;
                                                }
                                                if (j == 0) {
                                                    ans.append(charA);
                                                } else {
                                                    ans.setCharAt(9, (char)(intA + j));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


}