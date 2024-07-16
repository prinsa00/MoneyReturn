public class Change {
    public static void main (String[]args){
        int change = 2975;

        int numberOfThou = 0;
        int numberOfFiveHund = 0;
        int numberOfHund = 0;
        int numberOfFifty = 0;
        int numberOfTwenty = 0;
        int numberOfTen = 0;
        int numberOfFive = 0;

        if (change >= 1000){
            numberOfThou = change / 1000;
            change = change % 1000;
        }
        if (change >= 500){
            numberOfFiveHund = change / 500;
            change = change % 500;
        }
        if (change >= 100){
            numberOfHund = change / 100;
            change =change % 100;
        }
        if (change >= 50){
            numberOfFifty = change / 50;
            change =change % 50;
        }
        if (change >= 20){
            numberOfTwenty = change /20;
            change = change % 20;
        }
        if (change >= 10){
            numberOfTen = change / 10;
            change =change % 10;
        }
        if (change >= 5){
            numberOfFive = change /5;
            change = change % 5;
        }

        System.out.println("Number of thousands: " + numberOfThou);
        System.out.println("Number of five hundreds: " + numberOfFiveHund);
        System.out.println("Number of hundreds: " + numberOfHund);
        System.out.println("Number of fifties: " + numberOfFifty);
        System.out.println("Number of twenties: " + numberOfTwenty);
        System.out.println("Number of tens: " + numberOfTen);
        System.out.println("Number of fives: " + numberOfFive);
    }
}
