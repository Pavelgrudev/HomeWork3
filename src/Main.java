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
        System.out.println("Задача 1, Объявить переменные");
        byte a = -128;
        System.out.println(a);
        short b =32767;
        System.out.println(b);
        int c = 2147483647;
        System.out.println(c);
        long d = 1234566666666l;
        System.out.println(d);
        float e =3.4555555f;
        System.out.println(e);
        double f =9.5555555555555555;
        System.out.println(f);

    }

    public static void task2() {
        System.out.println("Задача 2, Инициализируйте переменные");

        byte a = 67;
        System.out.println(a);
        short b = -159;
        System.out.println(b);
        short b2 = 569;
        System.out.println(b2);
        int c = 27897;
        System.out.println(c);
        long d = 987678965549L;
        System.out.println(d);
        float e = 2.786F;
        System.out.println(e);
        double f = 27.12;
        System.out.println(f);
    }

    public static void task3() {
        System.out.println("Задача 3, рассчитать кол-во листов для каждого ученика");
        byte LP = 23;
        System.out.println("Учеников у Людмилы Павловны    " + (LP) + " чел.");
        byte AC = 27;
        System.out.println("Учеников у Анны Сергеевны   " + (AC) + " чел.");
        byte EA = 30;
        System.out.println("Учеников у Екатерины Андреевны   " + (EA) + " чел.");
        short ZL = 480;
        System.out.println("Закупка листов = " + (ZL) + "  шт.");
        int SS = ZL / (LP + AC + EA);
        System.out.println("На каждого ученика рассчитано  " + (SS) + " листов бумаги.");
    }


    public static void task4() {
        System.out.println("Задача 4, рассчитать производительность машины");

        byte BM = 16 / 2;
        System.out.println("Машина сделает " + (BM) + ",бутылок в минуту ");
        short  BM20 = (20 * 8);
        System.out.println("За 20 минут машина произвела " + BM20 + "  штук бутылок».");
        int DAY = BM * 60 * 24;
        System.out.println("За сутки  машина произвела " + DAY + "  штук бутылок».");
        int DAY3 = DAY * 3;
        System.out.println("За трое суток машина произвела " + DAY3 + "  штук бутылок».");
        int DAY30 = DAY3 * 10;
        System.out.println("За Месяц или 30 дней машина произвела " + DAY30 + "  штук бутылок».");
    }

    public static void task5() {
        System.out.println("Задача 5, рассчитать кол-во Классов, белой и коричневой краски.");

        int totalPaintCans = 120;
        System.out.println(totalPaintCans+ " банок");
        int WhitePaintForGrade1 = 2;
        System.out.println(WhitePaintForGrade1+ " банок");
        int BrownPaintForGrade1 = 4;
        System.out.println(BrownPaintForGrade1+ " банок");
        int totalPaintFor1Class = (BrownPaintForGrade1 + WhitePaintForGrade1);
        System.out.println(totalPaintFor1Class+ " банок");
        int totalClassesInTheSchool = (totalPaintCans / (BrownPaintForGrade1 + WhitePaintForGrade1));
        System.out.println("В школе всего " + totalClassesInTheSchool + " классов");
        int needCansOfBrownPaint = totalClassesInTheSchool * BrownPaintForGrade1;
        System.out.println("Для покраски 20 классов ,нужно " + needCansOfBrownPaint + " банок коричневой краски");
        int needCansOfWhitePaint = totalClassesInTheSchool * WhitePaintForGrade1;
        System.out.println("Для покраски 20 классов ,нужно " + needCansOfWhitePaint + "  Банок белой краски");
    }

    public static void task6() {
        System.out.println("Задача 6, рассчитать кол-во граммов и килограммов");

        short bananes = 5 * 80;
        System.out.println("Всего бананов " +bananes);
        short milk = 105 * 2;
        System.out.println("Всего молока " +milk);
        short iceCreamBriquette = 100 * 2;
        System.out.println("Всего мороженого " +iceCreamBriquette);
        short rawEggs = 70 * 4;
        System.out.println("Всего сырых яиц " +rawEggs);
        int sportsBreakfast = bananes + milk + iceCreamBriquette + rawEggs;
        System.out.println("Спортивный завтрак весит " + sportsBreakfast + "  Граммов. ");
        float SportsBreakfastKilograms = sportsBreakfast / 1000f;
        System.out.println("Спортивный завтрак весит " + SportsBreakfastKilograms + "  Килограммов. ");
    }

        public static void task7() {
        System.out.println("Задача 7, сколько в среднем уйдёт дней для похудения");

        float minimalWeightLossPerDay=0.25f;
        System.out.println(minimalWeightLossPerDay + "кг.");
        float maximalWeightLossPerDay=0.5f;
        System.out.println(maximalWeightLossPerDay+ "кг.");
        byte loseWeight=7;
        System.out.println(loseWeight+ " кг." );
        float slowWeightLoss=loseWeight/minimalWeightLossPerDay;
        System.out.println("Для медленного похудения требуется " +slowWeightLoss+  " дней");
        float fastWeightLoss=loseWeight/maximalWeightLossPerDay;
        System.out.println("Для быстрого похудения требуется "  +fastWeightLoss+ " дней" );
        float averageWeightLoss = (slowWeightLoss+fastWeightLoss)/2;
        System.out.println("Для  похудения в среднем темпе требуется "   +averageWeightLoss+  " дней" );

    }

    public static void task8() {
        System.out.println("Задача 8, Увеличить зарплату, " +
                "подсчитать разницу между сегодняшней и новой з/п. вывести в консоль" );
        int salaryMasha  =  67760;
        System.out.println("Зарплата Маши = " +salaryMasha+ " рублей в месяц.");
        int salaryDenis =  83690;
        System.out.println("Зарплата Дениса = " +salaryDenis+ " рублей в месяц.");
        int salaryKristina=76230;
        System.out.println("Зарплата Кристины = " +salaryKristina+ " рублей в месяц");
        int salaryMashaPerYear=salaryMasha*12;
        System.out.println("Зарплата Маши = " +salaryMashaPerYear+ " рублей в год.");
        int salaryDenisPerYear=salaryDenis*12;
        System.out.println("Зарплата Дениса = " +salaryDenisPerYear+ " рублей в год.");
        int salaryKristinaPerYear=salaryKristina*12;
        System.out.println("Зарплата Кристины = " +salaryKristinaPerYear+ " рублей в год");
        double futureSalaryMasha = salaryMasha*0.1+salaryMasha;
        System.out.println("Теперь, зарплата Маши  " +futureSalaryMasha+ " рублей в месяц");
        double futureSalaryMashaPerYear=futureSalaryMasha*12;
        System.out.println("Теперь Зарплата Маши = " +futureSalaryMashaPerYear+ " рублей в год.");
        double theAnnualIncomeOfTheMashaHasGrown=futureSalaryMashaPerYear-salaryMashaPerYear;
        System.out.println("Годовой доход Маши вырос на  " +theAnnualIncomeOfTheMashaHasGrown+ " рублей.");
        double futureSalaryDenis = salaryDenis*0.1+salaryDenis;
        System.out.println("Теперь зарплата Дениса " +futureSalaryDenis+ " рублей в месяц");
        double futureSalaryDenisPerYear=futureSalaryDenis*12;
        System.out.println("Теперь Зарплата Дениса = " +futureSalaryDenisPerYear+ " рублей в год.");
        double theAnnualIncomeOfTheDenisHasGrown=futureSalaryDenisPerYear-salaryDenisPerYear;
        System.out.println("Годовой доход Дениса вырос на  " +theAnnualIncomeOfTheDenisHasGrown+ " рублей.");
        double futureSalaryKristina=salaryKristina*0.1+salaryKristina;
        System.out.println("Теперь зарплата Кристины " +futureSalaryKristina+ " рублей в месяц");
        double futureSalaryKristinaPerYear=futureSalaryKristina*12;
        System.out.println("Теперь Зарплата Кристины = " +futureSalaryKristinaPerYear+ " рублей в год.");
        double theAnnualIncomeOfTheKristinaHasGrown =futureSalaryKristinaPerYear-salaryKristinaPerYear;
        System.out.println("Годовой доход Кристины вырос на  " +theAnnualIncomeOfTheKristinaHasGrown+ " рублей.");
    }

  }
