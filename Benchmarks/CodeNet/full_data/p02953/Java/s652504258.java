mport java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        int count = Integer.parseInt(line1);

        if (count == 1) {
            System.out.println("Yes");
        }

        String line2 = scanner.nextLine();
        String[] token = line2.split(" ");
        int[] height = new int[count];
        for (int i=0; i<count; i++) {
            height[i] = Integer.parseInt(token[i]);
        }

        try {
            int[] newHeight = new int[count];
            for (int i = count - 1; i > 0; i--) {
                if (i == count - 1) {
                    newHeight[i] = height[i];
                }
                int diff = height[i - 1] - newHeight[i];
                if (diff > 1) {
                    throw new RuntimeException();
                } else if (diff == 1) {
                    newHeight[i - 1] = height[i - 1] - 1;
                } else {
                    newHeight[i - 1] = height[i - 1];
                }
            }
            System.out.println("Yes");
        } catch (RuntimeException e) {
            System.out.println("No");
        }
    }

}
