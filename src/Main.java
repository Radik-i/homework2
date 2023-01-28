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
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 777777777;
        byte b = 101;
        short c = 29999;
        long d = 555555555555l;
        float e = 1.5f;
        double f = 358.789;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float g = 27.12f;
        long h = 987678965549l;
        double i = 2.786;
        short j = 569;
        short k = -159;
        int l = 27897;
        byte m = 67;

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte ludPav = 23;
        byte anSer = 27;
        byte ekAn = 30;
        short totalPaper = 480;
        int pupilPaper = totalPaper / (ludPav + anSer + ekAn);
        System.out.println("На каждого ученика расчитано " + pupilPaper + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        short laborCapacity = 16 / 2; //бутылок в минуту
        System.out.println("За 20 минут машина произвела " + 20 * laborCapacity + " штук бутылок");
        System.out.println("За сутки машина произвела " + 24 * 60 * laborCapacity + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + 3 * 24 * 60 * laborCapacity + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + 30 * 24 * 60 * laborCapacity + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        short white = 2;
        short brown = 4;
        int numberOfClasses = 120 / (white + brown);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfClasses * 2 + " банок белой краски и " + numberOfClasses * 4 + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6");
        short banana = 80;
        short milk = 105;
        short iceCream = 100;
        short egg = 70;
        float breakfast;
        breakfast = 5 * banana + 2 * milk + 2 * iceCream + 4 * egg;

        System.out.println("Спортзавтрак " + breakfast + " грамм или " + breakfast/1000 + " килограмм ");
    }

    public static void task7() {
        System.out.println("Задача 7");
        float lossMin = 0.25F;
        float lossMax = 0.5F;
        System.out.println("Если терять каждый день по 250 грамм, то добиться результата можно за " + 7/lossMin + " дней");
        System.out.println("Если терять каждый день по 500 грамм, то добиться результата можно за " + 7/lossMax + " дней");
    }

    public static void task8() {
        System.out.println("Задача 8");
       int masha = 67760;
       int denis = 83690;
       int kristina = 76230;
       float mashaNew = (float) (1.1 * masha);
       float denisNew = (float) (1.1 * denis);
       float kristinaNew = (float) 1.1 * kristina;

        System.out.println("Новая зарплата составит: у Маши " + mashaNew + " руб, у Дениса " + denisNew + " руб, у Кристины " + kristinaNew + " руб");
        System.out.println("Разница между годовой зарплатой составит: у Маши " + (mashaNew-masha)*12 + " руб, у Дениса " + (denisNew-denis)*12 + " руб, у Кристины " + (kristinaNew-kristina)*12 + " руб");

    }
}