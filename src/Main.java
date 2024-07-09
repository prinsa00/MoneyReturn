//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = 33, num2 = 67, num3 = 22;
        if (num1 > num2 && num1 > num3){
            System.out.println("The greatest number is " + num1);
        }
        else if (num2 > num3 && num2 > num1){
            System.out.println("The greatest number is " + num2);
        }
        else {
            System.out.println("The greatest number is " + num3);
        }

    }
}