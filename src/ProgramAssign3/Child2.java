/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/11/17
 * Time: 10:33 PM
 */
package ProgramAssign3;

public class Child2 extends Gift{

    boolean nice = true;

    public Child2(){
        Robot robo = new Robot(1);

        setChild("Kevin");
        setTrackNum(robo.getTrackNum());
        setNauOrNi(nice);

    }

}