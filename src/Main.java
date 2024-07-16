public class Main {
    public static void main(String[] args) {

        //Task 1
        System.out.println("Task 1");

        int clientOS = 1;

        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Task 2
        System.out.println("Task 2");

        int clientDeviceYear = 2015;

        if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }

        //Task 3
        System.out.println("Task 3");

        int year = 2021;

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0 && year % 400 != 0) {
            System.out.println(year + " год не является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Task 4
        System.out.println("Task 4");

        int deliveryDistance = 95;
        int daysForDelivery = 0;

        if (deliveryDistance < 20) {
            daysForDelivery ++;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            daysForDelivery += 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            daysForDelivery += 3;
        }

        if (daysForDelivery > 0) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }

        /* Сначала хотел сделать через count++ каждый раз по мере увеличения дистанции, но никак не придумал
        реализацию. Хоть этот код и работает, но выглядит странно. Как будто, есть более лаконичное решение
         */


        //Task 5
        System.out.println("Task 5");

        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас январь, сезон года - зима");
                break;
            case 2:
                System.out.println("Сейчас февраль, сезон года - зима");
                break;
            case 3:
                System.out.println("Сейчас март, сезон года - весна");
                break;
            case 4:
                System.out.println("Сейчас апрель, сезон года - весна");
                break;
            case 5:
                System.out.println("Сейчас май, сезон года - весна");
                break;
            case 6:
                System.out.println("Сейчас июнь, сезон года - лето");
                break;
            case 7:
                System.out.println("Сейчас июль, сезон года - лето");
                break;
            case 8:
                System.out.println("Сейчас август, сезон года - лето");
                break;
            case 9:
                System.out.println("Сейчас сентябрь, сезон года - осень");
                break;
            case 10:
                System.out.println("Сейчас октябрь, сезон года - осень");
                break;
            case 11:
                System.out.println("Сейчас ноябрь, сезон года - осень");
                break;
            case 12:
                System.out.println("Сейчас декабрь, сезон года - зима");
                break;
            default:
                System.out.println("Вы ввели некорректный мексяц");
                break;
        }


        //Task 6
        System.out.println("Task 6");

        int age = 19;
        int salary = 58_000;
        int creditCardLimit = 0;

        if (age  >= 23) {
            creditCardLimit = salary * 3;
        } else if (age < 23) {
            creditCardLimit = salary * 2;
        }

        if (salary >= 50_000 && salary < 80_000) {
            creditCardLimit = (int) (creditCardLimit * 1.2);
            //ссылаясь на наставника, решил хранить полученное значение в int, т.к. речь о целых рублях
        } else if (salary >= 80_000) {
            creditCardLimit = (int) (creditCardLimit * 1.5);
        }

        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditCardLimit + " рублей");


        //Task 7
        System.out.println("Task 7");

        int age2 = 25;
        int salary2 = 60_000;
        int wantedSum = 330_000;

        double baseRate = 0.1;
        int maxPaymentAmount = salary2 / 2;
        int loanDuration = 12;
        double clientRate = baseRate;

        if (age2 < 23) {
            clientRate = clientRate += 0.01;
        } else if (age2 < 30) {
            clientRate = clientRate += 0.005;
        }

        if (salary2 > 80_000) {
            clientRate = clientRate -= 0.007;
        }
        int overpayment = (int) (wantedSum * clientRate);
        int clientMonthlyPayment = (wantedSum + overpayment) / loanDuration;

        if  (clientMonthlyPayment > maxPaymentAmount) {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPaymentAmount + " рублей. " +
                    "Платеж по кредиту " + clientMonthlyPayment + " рублей. Отказано");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary2 + " равен " + maxPaymentAmount + " рублей. " +
                "Платеж по кредиту " + clientMonthlyPayment + " рублей. Одобрено");
        }
    }
}