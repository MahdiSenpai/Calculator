import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD) {

        double somme = (double) opG + (double) opD;
        return (int) somme;
    }

    public static int divide(int opG, int opD) {

        double divide = (double) opG / (double) opD;
        return (int) divide;
    }

    Public static int multiply(int OpA, int OpB) {
        double multiply = (double) OpA * (double) OpB;
        return (int) multiply;
    }

    Public static int sub(int op1, int op2) {
        double sub = (double) op1 - (double) op2;
        return (int) sub;
    }
}

