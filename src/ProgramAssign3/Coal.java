/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/11/17
 * Time: 8:30 PM
 */
package ProgramAssign3;

public class Coal extends Toy {

    private int amt;

    public Coal(int amount){

        amt = amount;

        setToy("Coal");
        setAmt(amt);
        setWeight(15.0);
    }
}