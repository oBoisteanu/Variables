import variables.Variables;

public class Main {
    public static void main(String[] args) {
        Variables myVariables = new Variables();
        myVariables.currentWorldPopulation = 7811080815L;
        myVariables.carsProducedThisYear = 55235358;
        myVariables.firstLetterInAlphabet = 'A';
        myVariables.javaIsAmazing = true;
        myVariables.pi = 3.14159;

        myVariables.printVariables();
    }
}