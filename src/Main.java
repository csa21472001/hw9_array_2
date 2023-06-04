
public class Main {
    public static void main(String[] args) {
        task1();
        generateRandomArray();
        task2();
        task3();
        task4();
//        task5();
//        task6();
//        task7();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int totalSalary = 0;
        for (int singleSalary : arr) {
            totalSalary += singleSalary;
        }
        System.out.println("Сумма затрат за месйц составила " + totalSalary + "рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxWaste = 100_000;
        int minWaste = 200_000;
        for (int singleSalary : arr) {
            if (singleSalary > maxWaste) {
                maxWaste = singleSalary;
            }
            if (minWaste > singleSalary) {
                minWaste = singleSalary;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. Максимальная сумма трат за день составила " + maxWaste + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        int totalWaste = 0;
        double medianWaste;
        for (int singleWaste : arr) {
            totalWaste += singleWaste;
        }
        medianWaste = totalWaste / 30.0;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", medianWaste);
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int currentLetter = reverseFullName.length - 1; currentLetter >= 0; currentLetter--) {
            System.out.print(reverseFullName[currentLetter]);
        }

    }


}