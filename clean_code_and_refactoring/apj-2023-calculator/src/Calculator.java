public class Calculator {
    public static int calculate(int firstOprand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOprand + secondOperand;
            case '-':
                return firstOprand - secondOperand;
            case '*':
                return firstOprand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOprand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
