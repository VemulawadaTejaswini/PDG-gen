public static void main(String[] args) {
        int a = (int) args[0];
        int b = (int) args[1];

        String result = (a * b) % 2 === 0 ? 'Even' : 'Odd';
        System.out.println(result);

    }