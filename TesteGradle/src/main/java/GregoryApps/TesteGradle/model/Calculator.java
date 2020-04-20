package GregoryApps.TesteGradle.model;

/**
 * @author Thiago Araújo
 * @since 14/04/2020 - 18:20
 * @version 1.0
 */
public class Calculator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    /**
     *
     * @return return the result of the sum between variables 'value1' and 'value2'
     */
    public double add(){
        return this.value1 + this.value2;
    }

    /**
     *
     * @return return the result of the subtraction between variables 'value1' and 'value2'
     */
    public double subtract(){
        return this.value1 - this.value2;
    }

    /**
     *
     * @return return the result of the division between variables 'value1' and 'value2'
     */
    public double divide(){
        return this.value1 / this.value2;
    }

    /**
     *
     * @return return the result of the multiplication between variables 'value1' and 'value2'
     */
    public double multiply(){
        return this.value1 * this.value2;
    }

    @Override
    public String toString() {
        return "\nValue 1: " + this.value1
             + "\nValue 2: " + this.value2
             + "\nSum: " + this.add()
             + "\nSubtraction: " + this.subtract()
             + "\nDivision: " + this.divide()
             + "\nMultiplication: " + this.multiply();
    }
}
