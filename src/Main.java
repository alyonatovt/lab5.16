
//public class Main {
//    public static void main(String[] args) {
//        int a = (int) (Math.random()*41-20);
//        System.out.println("Випадкове натуральне число на проміжку [-20;20]:" + a);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        double a = 3;
//        double b = 4;
//
//
//        double c = Math.sqrt(a * a + b * b);//теорема піфагора
//
//
//        double area = 0.5 * a * b;//площа
//
//
//        double perimeter = a + b + c;//периметр
//
//        System.out.println("Площа прямокутного трикутника: " + area);
//        System.out.println("Периметр прямокутного трикутника: " + perimeter);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        int randomNum = (int)(Math.random() * 101);
//        System.out.println("Рандомно згенероване число: " + randomNum);
//        String num = Integer.toString(randomNum);
//        System.out.println("Кількість цифр у згенерованому числі: " + num.length() );
//
//    }
//}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int attempts = 2;

        System.out.println("Гра лотерея! Відгадайте послідовність трьох чисел з проміжку [1; 3].");


        int randomNumber1 = random.nextInt(3) + 1;
        int randomNumber2 = random.nextInt(3) + 1;
        int randomNumber3 = random.nextInt(3) + 1;

        while (attempts > 0) {
            System.out.print("Введіть послідовність трьох чисел (через пробіл): ");
            int guess1 = scanner.nextInt();
            int guess2 = scanner.nextInt();
            int guess3 = scanner.nextInt();

            if (guess1 == randomNumber1 && guess2 == randomNumber2 && guess3 == randomNumber3) {
                System.out.println("Вітаємо! Ви відгадали правильну послідовність чисел.");
                return;
            } else {
                System.out.println("Невірна послідовність чисел. Спробуйте ще раз.");
                attempts--;
            }
        }

        System.out.println("Ви не відгадали правильну послідовність чисел. Гра завершена.");
    }
}