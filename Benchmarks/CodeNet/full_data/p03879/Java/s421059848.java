class Main {
    public static void main(String[]$) {
        int x1 = new java.util.Scanner(System.in).nextInt(), y1 = new java.util.Scanner(System.in).nextInt(), x2 = new java.util.Scanner(System.in).nextInt(), y2 = new java.util.Scanner(System.in).nextInt(), x3 = new java.util.Scanner(System.in).nextInt(), y3 = new java.util.Scanner(System.in).nextInt();
        System.out.println(Math.max(Math.max(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)),Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))),Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)))/(2+Math.max(Math.max(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)),Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))),Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3)))/(Math.abs((x2-x1)*(y3-y1)-(x3-x1)*(y2-y1))/(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))+Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3))+Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3))))));
    }
}