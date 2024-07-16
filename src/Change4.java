public class Change4{
    public static void main(String[]args){
        int change = 1785;

        int numberOfThou = 0;
        int numberOfFh = 0;
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
            numberOfFh = change / 500;
            change = change % 500;
        }
        if (change >= 100){
            numberOfHund = change / 100;
            change = change % 100;
        }
        if (change >= 50){
            numberOfFifty = change / 50;
            change = change % 50;
        }
        if (change >= 20){
            numberOfTwenty = change / 20;
            change = change % 20;
        }
        if (change >= 10){
            numberOfTen = change / 10;
            change = change % 10;
        }
        if (change >= 5){
            numberOfFive = change / 5;
            change = change % 5;
        }

        System.out.println("The number of 1000: " + numberOfThou);
        System.out.println("The number of 500: " + numberOfFh);
        System.out.println("The number of 100: " + numberOfHund);
        System.out.println("The number of 50: " + numberOfFifty);
        System.out.println("The number of 20: " + numberOfTwenty);
        System.out.println("The number of 10: " + numberOfTen);
        System.out.println("The number of 5: " + numberOfFive);

    }
}