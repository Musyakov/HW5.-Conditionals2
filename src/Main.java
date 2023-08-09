public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS = 4;
        if (clientOS == 0) {
            System.out.println("Please download the App via the link for AppStore below");
        } else if (clientOS == 1) {
            System.out.println("Please download the App via the link for Play Market below");
        } else {
            System.out.println("You entered the wrong data. Please try again");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Please download the App via the link for AppStore below");
            } else {
                System.out.println("Please download the App via the link for AppStore below");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Please download the App via the link for Play Market below");
            } else {
                System.out.println("Please download the light version of App via the link for Play Market below");
            }
        } else {
            System.out.println("You entered the wrong data. Please try again");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int year = 396;
        boolean isLeapYear = ((year > 1584) && (year % 4 == 0) && (year % 100 != 0) || (year > 1584) && (year % 400 == 0));
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " isn't a leap year");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        boolean isShortRange = deliveryDistance <= 20 && deliveryDistance >= 0;
        boolean isMediumRange = deliveryDistance > 20 && deliveryDistance < 60;
        boolean isLongRange = deliveryDistance >= 60 && deliveryDistance <= 100;
        boolean isOutOfRange = deliveryDistance > 0;
        if (isShortRange) {
            System.out.println("It will take 1 days to deliver the credit card");
        } else if (isMediumRange){
            System.out.println("It will take 2 days to deliver the credit card");
        } else if (isLongRange) {
            System.out.println("It will take 3 days to deliver the credit card");
        } else if (isOutOfRange) {
            System.out.println("Unfortunately, it is impossible to deliver the credit card to the selected location");
        }
        else {
            System.out.println("You entered the wrong data. Please try again");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Its' winter.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Its' spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Its' summer.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Its' autumn.");
                break;
            default:
                System.out.println("You entered the wrong data. Please try again.");
        }
    }
}