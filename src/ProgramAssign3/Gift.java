/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/2/17
 * Time: 12:10 AM
 */
package ProgramAssign3;

public class Gift { //For the Children

    private String child;
    private int trackNum;
    private boolean nauOrNi;

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child;
    }

    public void setTrackNum(int num){

        trackNum = num;

    }

    public int getTrackNum() {
        return trackNum;
    }

    public boolean isNauOrNi() {
        return nauOrNi;
    }

    public void setNauOrNi(boolean nauOrNi) {
        this.nauOrNi = nauOrNi;
    }
}