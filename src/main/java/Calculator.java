public class Calculator {

    private int number1;
    private int number2;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    };

    public int Add(){
        return number1 + number2;
    }

    public int Subtract(){
        return number1 - number2;
    }

    public int Multiply(){
        return number1 * number2;
    }

    public double Divide(){
        return number1 / number2;
    }
}
