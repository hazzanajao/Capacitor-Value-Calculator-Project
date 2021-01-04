/**********************************************************************************************************************
 *AUTHOR       : AJAO HAZZAN                                                                                          *
 *DATE         : 23-12-2020                                                                                           *
 *LOCATION     : FINLAND                                                                                              *
 *PROJECT      : CAPACITORS' VALUE CALCULATOR                                                                         *
 **********************************************************************************************************************
 *DESCRIPTIONS :                                                                                                      *
 *This software was developed as an helpful kit for electricians who wants to calculate the capacitance of a          *
 *capacitor or capacitive reactance of a capacitor, that is suitable for their electronic project development.        *
 **********************************************************************************************************************                                                                                                                        *
 * It also covered calculation of parallel and serial capacitive circuits,in order to know the effective              *
 * capacitance of four capacitors arranged in parallel or in series                                                   *               
 **********************************************************************************************************************/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Capacitors cp = new Capacitors();
        Scanner consoleInput = new Scanner(System.in);
        /*<<---------------- Task 1------------------------->>*/
        System.out.println("To Calculate Value of a Capacitor");
        System.out.println("Enter Frequency Value            ");
        double inputFreqValue = consoleInput.nextInt();
        cp.freq = inputFreqValue;
        System.out.println("Enter Capacitive Reactance Value.");
        double inputXcValue = consoleInput.nextInt();
        cp.Xc = inputXcValue;
        System.out.println("The Formula is:                  ");
        cp.ShowFormula();
        cp.calculateTheValue();
        System.out.println("                                  ");
        /*<<---------------- Task 2------------------------->>*/
        System.out.println(
                "Enter ....>> 1: To calculate the effective " +
                        "capacitance of capacitors in  series.\n" +
                        "Enter .....>>2: To know the formula for " +
                        "calculating serial capacitive Cct.\n" +
                        "Enter .....>>3: To know the effective capacitance " +
                        "formula of 2 capacitors in parallel.\n" +
                        "Enter .....>>4: To know the effective capacitance " +
                        "formula of 3 capacitors in parallel.\n" +
                        "Enter .....>>5: To know the effective capacitance " +
                        "formula of 4 capacitors in parallel.\n" +
                        "Enter .....>>6: To know the formula calculating" +
                        " for serial capacitive Cct.\n " +
                        "Enter....>>7: To know the formula for calculating parallel\n" +
                        "capacitive circuit.\n");
        double paraCal1 = consoleInput.nextInt();
        if (paraCal1 == 1) {
            System.out.println("To Calculate Effective Capacitance " +
                    "of 2 capacitors in series");
            System.out.println("Enter cap1 value                 ");
            double inputCap1Value = consoleInput.nextInt();
            cp.cap1 = inputCap1Value;
            System.out.println("Enter cap2 value                 ");
            double inputCap2Value = consoleInput.nextInt();
            cp.cap2 = inputCap2Value;
            cp.CalculateSerialEffectiveCapOf2();
            System.out.println("                                 ");
            /*<<---------------- Task 3------------------------->>*/
            System.out.println("To Calculate Effective Capacitance " +
                    "of 3 capacitors in series");
            System.out.println("Enter cap1 value                 ");
            inputCap1Value = consoleInput.nextInt();
            cp.cap1 = inputCap1Value;
            System.out.println("Enter cap2 value                 ");
            inputCap2Value = consoleInput.nextInt();
            cp.cap2 = inputCap2Value;
            //  cp.CalculateParallelEffectiveCapOf2();
            System.out.println("Enter cap3 value                 ");
            double inputCap3Value = consoleInput.nextInt();
            cp.cap3 = inputCap3Value;
            cp.CalculateSerialEffectiveCapOf3();
            System.out.println("                                 ");
            /*<<---------------- Task 4------------------------->>*/
            System.out.println("To Calculate Effective Capacitance " +
                    "of 4 capacitors in series");
            System.out.println("Enter cap1 value                 ");
            inputCap1Value = consoleInput.nextInt();
            cp.cap1 = inputCap1Value;
            System.out.println("Enter cap2 value                 ");
            inputCap2Value = consoleInput.nextInt();
            cp.cap2 = inputCap2Value;
            System.out.println("Enter cap3 value                 ");
            inputCap3Value = consoleInput.nextInt();
            cp.cap3 = inputCap3Value;
            System.out.println("Enter cap4 value                 ");
            double inputCap4Value = consoleInput.nextInt();
            cp.cap4 = inputCap4Value;
            cp.CalculateSerialEffectiveCapOf4();
            System.out.println("                                 ");
        } else if (paraCal1 == 2) {
            cp.ShowSerialCapacitanceValue();
        } else if (paraCal1 == 3) {
            System.out.println("To Calculate Effective Capacitance " +
                    "of 2 capacitors in parallel");
            System.out.println("Enter cap1 value                 ");
            double inputCap1Value = consoleInput.nextInt();
            cp.cap1 = inputCap1Value;
            System.out.println("Enter cap2 value                 ");
            double inputCap2Value = consoleInput.nextInt();
            cp.cap2 = inputCap2Value;
            cp.CalculateParallelEffectiveCapOf2();
        } else if (paraCal1 == 4) {
            System.out.println("To Calculate Effective Capacitance " +
                    "of 3 capacitors in parallel");
            System.out.println("Enter cap1 value                 ");
            double inputCap1Value = consoleInput.nextInt();
            cp.cap1 = inputCap1Value;
            System.out.println("Enter cap2 value                 ");
            double inputCap2Value = consoleInput.nextInt();
            cp.cap2 = inputCap2Value;
            System.out.println("Enter cap3 value                 ");
            double inputCap3Value = consoleInput.nextInt();
            cp.cap3 = inputCap3Value;
            cp.CalculateParallelEffectiveCapOf3();
            System.out.println("                                 ");

        } else if (paraCal1 == 5) {
            System.out.println("To Calculate Effective Capacitance " +
                    "of 4 capacitors in parallel");
            System.out.println("Enter cap1 value                 ");
            double inputCap1Value = consoleInput.nextInt();
            cp.cap1 = inputCap1Value;
            System.out.println("Enter cap2 value                 ");
            double inputCap2Value = consoleInput.nextInt();
            cp.cap2 = inputCap2Value;
            System.out.println("Enter cap3 value                 ");
            double inputCap3Value = consoleInput.nextInt();
            cp.cap3 = inputCap3Value;
            System.out.println("Enter cap4 value                 ");
            double inputCap4Value = consoleInput.nextInt();
            cp.cap4 = inputCap4Value;
            cp.CalculateParallelEffectiveCapOf4();
            System.out.println("                                 ");

        } else if (paraCal1 == 6) {

            cp.ShowSerialCapacitanceValue();

        } else if (paraCal1 == 7) {
            cp.ShowParallelCapacitanceValue();
        }
    }
}
/*Kiss
 *Dry
 */
