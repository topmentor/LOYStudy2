import java.util.Random;

public class introExam {

    public static void main(String[] args) {

        final int NUMBER_COUNT = 10;

        Random random = new Random();
        int[] numbers = new int[NUMBER_COUNT];
        int[] count = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1;
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("" + numbers[i]);

            if ((i + 1) % 5 == 0 && i != numbers.length - 1) {
                System.out.print("\n");
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int num : numbers) {
            if (num % 2 == 0) {
                count[2] += 1;
            }
            if (num % 3 == 0) {
                count[3] += 1;
            }
            if (num % 5 == 0) {
                count[5] += 1;
            }
        }

        System.out.println("2의 배수 개수: " + count[2]);
        System.out.println("3의 배수 개수: " + count[3]);
        System.out.println("5의 배수 개수: " + count[5]);
    }
}
