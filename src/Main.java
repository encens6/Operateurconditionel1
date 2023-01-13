public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age < 18){
            System.out.println("You can't drive");
        } else {
            System.out.println("You can drive :)");
        }
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }


    public static void task1 () {
        System.out.println("Task 1: ");
        int age2 = 25;
        if (age2 >= 18) {
            System.out.println("The personne is " + (age2) + "years old.");
        }
        if (age2 < 18) {
            System.out.println("The personne don't have the right age, you will need to wait a bit more.");
        }
    }

    public static void task2 () {
        System.out.println("Task 2: ");
        int temp = 5;
        if (temp <= 5) {
            System.out.println("It's cold outside, you should wear a hat !");
        }
        if (temp > 5) {
            System.out.println("It's hot outside, you can go out without thr hat.");
        }
    }

    public static void task3 () {
        System.out.println("Task 3: ");
        int speed = 55;
        if (speed < 60) {
            System.out.println("You can continue to drive.");
        }
        if (speed >= 61) {
            System.out.println("You will have to pay a fine !");
        }
    }

    public static void task4 () {
        System.out.println("Task 4: ");
        int age = 95;
        if (age >= 2 && age <= 6 ){
            System.out.println("If your age is " + age + " , you are in kinder garden.");

        }
        if (age >= 7 && age <= 18) {
            System.out.println("If you are " + age + " you are in school.");
        }

        if (age >= 18 && age <= 24){
            System.out.println("If you are " + age + " you are in university.");

        }
        if (age > 24 ){
            System.out.println("If you are " + age + " it's time for you to go  to work.");
        }
    }

    public static void task5 () {
        System.out.println("Task 5: ");
        int age = 5;
        if (age >= 5 && age <= 14) {
            System.out.println("You can go for a ride ONLY with your parents.");
        }
        if (age < 5 ) {
            System.out.println("You can't go for a ride.");
        }
        if (age > 14 ) {
            System.out.println("You can go for a ride without your parents.");
        }

    }

    public static void task6 () {
        System.out.println("Task 6: ");
        int wagonCapacity = 102;
        int sitPlaceCapacity = 60;
        int standingPlaces = 42;
        int personneStanding = 15;
        int personOnSitPlaces = 45;
        int availableSitPlaces = (sitPlaceCapacity - personOnSitPlaces);
        int availableStandingPlaces = (standingPlaces - personneStanding);

        if (personneStanding + personOnSitPlaces >= wagonCapacity) {
            System.out.println("The wagon is full.");
        } else {
            System.out.println("There is " + availableSitPlaces + " siting places available and " + availableStandingPlaces + " standing places.");
        }
    }

    public static void task7 () {
        System.out.println("Task 7: ");
        int one = 1;
        int two = 5;
        int three = 3;
        if (one < three && two < three) {
            System.out.println("Three is the highest number.");
        } else {
            if (one > two && one > three) {
                System.out.println("One is the highest number. ");
            } else {
                if (two > one && two > three) {
                    System.out.println("Two is the highest number." );
                }
            }
        }
    }
}
