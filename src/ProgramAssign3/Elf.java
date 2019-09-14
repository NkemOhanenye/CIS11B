/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/2/17
 * Time: 12:11 AM
 */
package ProgramAssign3;

public class Elf implements Weightable{ //For Santa and the Helpers

    private String elf;
    private double mass;
    private int amt;

    public void setElf(String n){
        elf = n;
    }

    public String getElf() {
        return elf;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    @Override
    public void setWeight(double w) {
        mass = (amt*w);
    }

    @Override
    public double getWeight() {
        return mass;
    }


}