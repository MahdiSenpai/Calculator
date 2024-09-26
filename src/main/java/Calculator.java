import java.util.HashSet;
import java.util.Set;

public class Calculator {
    public static int add(int opG, int opD) {

        double somme = (double) opG + (double) opD;
        return (int) somme;
    }

    public static int divine(int opG, int opD) {

        double divine = (double) opG / (double) opD;
        return (int) divine;
    }


}
