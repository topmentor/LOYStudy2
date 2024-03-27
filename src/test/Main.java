package Study;

import java.util.Random;

// 조범준 

public class Main {
    public static void main(String[] args) {

        Random random = new Random();


        int[] numbers = new int[50];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }



        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if ((i + 1) % 5 == 0 && i != numbers.length - 1) {
                System.out.print("/");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();


        int multipleOf2 = 0;
        int multipleOf3 = 0;
        int multipleOf5 = 0;


        for (int num : numbers) {
            if (num % 2 == 0) {
                multipleOf2++;
            }
            if (num % 3 == 0) {
                multipleOf3++;
            }
            if (num % 5 == 0) {
                multipleOf5++;
            }
        }


        System.out.println("2의 배수 개수: " + multipleOf2);
        System.out.println("3의 배수 개수: " + multipleOf3);
        System.out.println("5의 배수 개수: " + multipleOf5);
    }
}