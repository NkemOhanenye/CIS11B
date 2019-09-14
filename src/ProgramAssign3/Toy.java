/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/2/17
 * Time: 12:10 AM
 */
package ProgramAssign3;

public class Toy implements Weightable{ //For the toys

    private String toy;
    private double mass;
    private int trackNum;
    private int amt;

    public void setToy(String n){

        toy = n;

    }

    public String getToy() {
        return toy;
    }

    public void setTrackNum(int num){

        trackNum = num;

    }

    public int getTrackNum() {
        return trackNum;
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