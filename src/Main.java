public class Main {
    public static void main(String[] args) {
        // Домашняя работа 3.2
        // Задание 1
        System.out.println("Задание 1");
        int currentYear = 2022;
        int startPeriod = currentYear - 200;
        int endPeriod = currentYear + 100;
        int theCometWillFlyBy = 79;
        for (int i = startPeriod; i <= endPeriod; i++) {
            if (i % theCometWillFlyBy == 0) {
                System.out.println(i);
            }
        }
        // Задание 2
        System.out.println("Задание 2");
        int i = 2;
        for (int j = 1; j < 11; j++) {
            int sum = 0;
            sum = i * j;
            System.out.println(i + "*" + j + "=" + sum);
        }

    }
}