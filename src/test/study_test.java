package study;

import java.util.Random;

// 암건우

public class study_test {
    public static void main(String[] args) {
        Random 정수 = new Random();
        int[] 임의숫자 = new int[50];

        for (int a = 0; a < 임의숫자.length; a++) {
            임의숫자[a] = 정수.nextInt(10);
        }
        int 이 = 0;
        int 삼 = 0;
        int 오 = 0;

        for (int a = 0; a < 임의숫자.length; a++) {
            System.out.print(임의숫자[a]);
            if ((a + 1) % 5 == 0) {
                System.out.println();
            }
            if (임의숫자[a] % 2 == 0) {
                이++;
            }
            if (임의숫자[a] % 3 == 0) {
                삼++;
            }
            if (임의숫자[a] % 5 == 0) {
                오++;
            }
        }
        System.out.println("2의 배수:" + 이);
        System.out.println("3의 배수:" + 삼);
        System.out.println("5의 배수:" + 오);
        }
    }

