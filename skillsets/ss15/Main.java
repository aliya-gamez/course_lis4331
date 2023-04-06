import java.lang.reflect.Method;

public class Main
{
    public static void main(String[] args) {
        Methods.getRequirements();
        int arraySize = 0;
        int validInts[];

        arraySize = Methods.validateArraySize();

        validInts = Methods.validateUserInput(arraySize);

        Methods.displayNums(validInts);
        Methods.displayReverse(validInts);
        Methods.displaySum(validInts);
        Methods.displayHigherThanAverage(validInts);
    }
}