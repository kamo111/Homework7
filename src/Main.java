public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1.");
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + 15_000;
            i++;
            System.out.println( "Месяц " + i + ", сумма накоплений равна " + total + " рублей" );
        }

        System.out.println("Задание 2.");
        int num = 0;
        while (num < 10) {
            num++;
            System.out.print( " " + num);
        }
        System.out.println();
        for (num = 10; num > 0; num--) {
            System.out.print( " " + num);
        }
        System.out.println();

        System.out.println("Задание 3.");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        for (i=1; i <= 10; i++) {
            population = population + birthRate * population/1000 - deathRate * population/1000;
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }

        System.out.println("Задание 4.");
        int cashSavingsInterestRate = 15_000;
        total = 0;
        i = 0;
        while ( total <= 12_000_000) {
            i++;
            total = total + total*7/100;
            total = total + cashSavingsInterestRate;
            System.out.println( "Месяц "+ i + ", сумма накоплений равна " + total + " рублей" );
        }

        System.out.println("Задание 5.");
        cashSavingsInterestRate = 15_000;
        total = 0;
        for (i = 0; total <= 12_000_000;  i++) {
            total = total + total*7/100;
            total = total + cashSavingsInterestRate;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }

        System.out.println("Задание 6.");
        cashSavingsInterestRate = 15_000;
        total = 0;
        for (i = 0; i <= 108; i++) {
            total = total + total*7/100;
            total = total + cashSavingsInterestRate;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
            }
        }

        System.out.println("Задание 7.");
        int friday = 3;
        for (i = 1; i <= 31;  i++) {
            if (i == friday) {
                friday = friday + 7;
                System.out.println("Сегодня пятница," + i + "-е число. Необходимо подготовить отчет.");
            }
        }

        System.out.println("Задание 8.");
        int year = 7900;
        int year200 = year - 200;
        int year100 = year + 100;
        for (i = year200; i < year100;  i = i + 79) {
                System.out.println(i);
            }


    }
}