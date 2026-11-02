public class Main {
    public static void main(String[] args) {
//        int age = 19;
//        if (age >= 18) {
//            System.out.println("Ты можешь водить");
//        } else {
//            System.out.println("Ты не можешь водить");
//        }
//        int ageForAll = 19;
//        if (age >= 18 && age < 21) {
//            System.out.println("Ты достаточно взрослы чтобы водить но недостаточно взрослый чтобы пить алкоголь");
//        }
//        if (age < 7 || age > 18) {
//            System.out.println("Я думаю ты не ходишь в школу");
//        }
//        boolean oceanIsBlue = true;
//        if (oceanIsBlue) {
//            System.out.println("Океан голубой");
//        }

//        boolean canNotGoToSchool = age < 7 || age > 18;
//        if (canNotGoToSchool) {
//            System.out.println("Я думаю ты не ходишь в школу");
//        }
//        int day = 25;
//        boolean isSanitaryDay = day == 15;
//        if (isSanitaryDay) {
//            System.out.println("Сегодня санитарный день");
//        } else {
//            System.out.println("Сегодня обычный день");
//        }
        System.out.println("=Задача № 1=");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека = " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека = " + age + ", то он не достиг совершеннолетия и нужно немного подождать");
        }
        System.out.println("=Задача № 2=");
        int teperature = 4;
        if (teperature < 5) {
            System.out.println("На улице -" + teperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице -" + teperature + " градусов, можно идти без шапки");
        }

        System.out.println("=Задача № 3=");
        int speed = 55;
        if (speed > 60) {
            System.out.println("Если скорость - " + speed + " км/ч, придется заплатить штраф");
        } else {
            System.out.println("Если скорость - " + speed + " км/ч, можно ездить спокойно");
        }
        System.out.println("=Задача № 4=");
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен - " + age + " то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен - " + age + " то ему нужно ходить в школу");
        }
        if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен - " + age + " то его место в университете");
        }
        if (age > 24) {
            System.out.println("Если возраст человека - " + age + " то ему пора ходить на работу");
        }
        System.out.println("=Задача № 5=");
        age = 15;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " - нельзя кататься на аттракционе");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст ребенка равен " + age + " - можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age > 14) {
            System.out.println("Если возраст ребенка " + age + " - можно кататься без сопровождения");
        }
        System.out.println("=Задача № 6=");
        int peopleInTrain = 120;
        if (peopleInTrain < 60) {
            System.out.println("В поезде есть места для сидения");
        } else if (peopleInTrain < 102) {
            System.out.println("В поезде есть места только для проезда стоя");
        } else {
            System.out.println("В поезде нет свободных мест");
        }

        System.out.println("=Задача № 7=");
        int one = 5;
        int two = 5;
        int three = 3;
        if (one >= two && one >= three) {
            System.out.println("Большее число - " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Большее число - " + two);
        } else {
            System.out.println("Большее число - " + three);
        }

        System.out.println("=Задача № 8 II==");
        int number = 2;
        if (number % 2 == 0) {
            System.out.println(number + " - четное");
        } else {
            System.out.println(number + " - нечетное");
        }
        System.out.println("=Задача № 9 II==");
        int point = 90;
        if (point >= 90) {
            System.out.println("Отлично");
        } else if (point >= 70) {
            System.out.println("Хорошо");
        } else if (point >= 50) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
        System.out.println("=Задача № 10 II==");
        int sideA = 1;
        int sideB = 1;
        int sideC = 600;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideC + sideB > sideA) {
            System.out.println("Построить треугольник возможно");
        } else {
            System.out.println("Треугольник построить невозможно");
        }
        System.out.println("=Задача № 11 II==");
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - год високосный");
        } else {
            System.out.println(year + " - год не високосный");
        }
        System.out.println("=Задача № 12 II==");
        int ageOfViewer = 4;
        if (ageOfViewer < 5) {
            System.out.println("Вход бесплатный");
        } else if (ageOfViewer >= 5 && ageOfViewer <= 17) {
            System.out.println("Вход 200 рублей");
        } else if (ageOfViewer >= 18 && ageOfViewer <= 60) {
            System.out.println("Вход 400 рублей");
        } else {
            System.out.println("Вход 250 рублей");
        }
        System.out.println("=Задача № Доп А");

        int a = 25;
        int b = 2;
        if (a > b) {
            System.out.println("Число " + a + " больше");
        } else if (b > a) {
            System.out.println("Число " + b + " больше");
        } else {
            System.out.println("Числа равны");
        }
        System.out.println("=Задача № Доп В");
        if (a > 0) {
            System.out.println("Число " + a + " - положительное");
        } else if (a == 0) {
            System.out.println("Число " + a + " - равно нулю");
        } else {
            System.out.println("Число " + a + " - отрицательное");
        }
        System.out.println("=Задача № Доп С");
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("Число делится на 3 и на 5");
        } else if (a % 3 == 0 && a % 5 != 0) {
            System.out.println("Число делится только на 3");
        } else if (a % 3 != 0 && a % 5 == 0) {
            System.out.println("Число делится на 5, но не на 3");
        } else {
            System.out.println("Число не делится ни на 3 ни на 5");
        }
        System.out.println("=Задача № Доп Д");
        int temperature = 5;
        if (temperature < 0) {
            System.out.println("На улице холодно");
        } else if (temperature < 15) {
            System.out.println("На улице прохладно");
        } else if (temperature < 25) {
            System.out.println("На улице тепло");
        } else {
            System.out.println("На улице жарко");
        }
        System.out.println("=Задача № Доп Г");
        int agePeopleOfCinema = 61;
        boolean isWeekend = false;
        if (agePeopleOfCinema < 7) {
            System.out.println("Билеты в кино бесплатно всегда");
        } else if (agePeopleOfCinema <= 17) {
            if (isWeekend) {
                System.out.println("Стоимость билета - 150 рублей");
            } else {
                System.out.println("Стоимость билета - 100 рублей");
            }
        } else if (agePeopleOfCinema <= 60) {
            if (isWeekend) {
                System.out.println("Стоимость билета - 400 рублей");
            } else {
                System.out.println("Стоимость билета - 300 рублей");
            }
        } else {
            System.out.println("Стоимость билета - 150 рублей");
        }

        int password = 456;
        int login = 123;
        if (password == 456 && login == 123) {
            System.out.println("Доступ разрешен");
        } else if (login != 123) {
            System.out.println("Неверный логин");
        } else {
            System.out.println("Неверный пароль");
        }


    }


}