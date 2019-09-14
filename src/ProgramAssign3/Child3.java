/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/11/17
 * Time: 10:33 PM
 */
package ProgramAssign3;

public class Child3 extends Gift{

    boolean nice = true;

    public Child3(){
        ActionFigure figure = new ActionFigure(1);

        setChild("Mindy");
        setTrackNum(figure.getTrackNum());
        setNauOrNi(nice);

    }

}