public class Capacitors extends ParallelCapacitor implements ParallelNSerialCap {

    public static final double pI = 3.142;
    public double freq;
    public double Xc;
    public double cap1;
    public double cap2;
    public double cap3;
    public double cap4;

    @Override
    public void ShowFormula() {

        System.out.println("cap=1/(2*pI*freq*Xc). Given, pI = 3.142.");
    }

    @Override
    public void calculateTheValue() {
        double cap = 1 / (2.0 * pI * freq * Xc);
        System.out.println("Capacitor value is :" + "---->> " + cap);
    }

    public void CalculateSerialEffectiveCapOf2() {
        double cap_T = 1 / (cap1 + cap2);
        System.out.println("The Effective Capacitance  value is :" +
                "---->> " + cap_T);
    }

    @Override
    public void CalculateSerialEffectiveCapOf3() {
        double cap_T = 1 / (cap1 + cap2 + cap3);
        System.out.println("The Effective Capacitance  value is :" +
                "---->> " + cap_T);
    }

    @Override
    public void CalculateSerialEffectiveCapOf4() {
        double cap_T = 1 / (cap1 + cap2 + cap3 + cap4);
        System.out.println("The Effective Capacitance  value is :" + cap_T);
    }

     public void CalculateParallelEffectiveCapOf2() {
        double cap_T = (cap1 + cap2);
        System.out.println("The Effective Capacitance  value is :" +
                "---->> " + cap_T);
    }

    @Override
    public void CalculateParallelEffectiveCapOf3() {
        double cap_T = (cap1 + cap2 + cap3);
        System.out.println("The Effective Capacitance  value is :" +
                "---->> " + cap_T);
    }

    @Override
    public void CalculateParallelEffectiveCapOf4() {
        double cap_T = (cap1 + cap2 + cap3 + cap4);
        System.out.println("The Effective Capacitance  value is :" + cap_T);
    }


    @Override
    public void ShowSerialCapacitanceValue() {
        System.out.println("The Effective Capacitance value is calculated " +
                "with this formula : \n" +
                "cap_T = 1 / (cap1 + cap2 + cap3 + cap4 " +
                "+ cap..nth-1 + cap..nth.\n" + " \n" +
                "NB: The Effective, Equivalent and Total Capacitance Connotes\n" +
                "The same Meaning. This is usually being calculated in both\n" +
                "serial and parallel circuits.");

    }

    @Override
    public void ShowParallelCapacitanceValue() {
        System.out.println("The Effective Capacitance value is calculated " +
                "with this formula : \n" +
                "cap_T = (cap1 + cap2 + cap3 + cap4 " +
                "+ cap..nth-1 + cap..nth.\n" +" \n" +
                "NB: We connect capacitors in parallel, inorder to increase their\n" +
                "capacitance or capacity.");

    }

}

