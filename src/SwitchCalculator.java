import java.util.Scanner;

public class SwitchCalculator{
    public static void main(String[] args) {
        int result = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("------------------------ ");
            System.out.println(":Calculator suing SWITCH:");
            System.out.println("------------------------ ");
            System.out.print("Enter You Operator (+, -, *, /, %) : ");
            char operator = scan.next().charAt(0);

            System.out.print("Enter First Number  :  ");
            int operandOne = scan.nextInt();

            System.out.print("Enter Second Number : ");
            int operandTwo = scan.nextInt();

            switch(operator){
                case '+':
                    result = operandOne+operandTwo;
                    break;
                case '-':
                    result = operandOne-operandTwo;
                    break;
                case '*':
                    result = operandOne*operandTwo;
                    break;
                case '/':
                    result = operandOne/operandTwo;
                    break;

            }

            System.out.println(operandOne +" "+ operator + " "+ operandTwo + " = : " + result);
           
        }
       



    }
}