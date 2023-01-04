public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();

    }

    public static void task1() {
        for (byte i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        for (byte i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        for (byte i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        for (byte i = 10; i >= -10; i--) {
            System.out.println(i);
        }
    }

    public static void task5() {
        for (short i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
    }

    public static void task6() {
        for (short i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task7() {
        for (short i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task8() {
        int vklad = 29000;
        int total = 0;
        for (byte i = 1; i <= 12; i++) {
            total = total + vklad;
            System.out.println("Месяц " + i + " сумма накомплений равна " + total + " рублей");
        }
    }

    public static void task9() {
        int vklad = 29000;
        int total = 0;
        for (byte i = 1; i <= 12; i++) {
            total += total / 100;
            total += vklad;
            System.out.println("Месяц " + i + " сумма накомплений равна " + total + " рублей");
        }
    }

    public static void task10() {
        byte a = 2;
        for (byte i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + a * i);
        }
        System.out.print("Домашка выполнена!");
    }
}