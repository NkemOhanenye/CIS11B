/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/2/17
 * Time: 12:19 AM
 */
package ProgramAssign2;

public class TruthTable {

    private boolean first;
    private boolean second;

    //Main Truth Table
    public TruthTable(){

        defaultInput1();
        defaultInput2();

    }
    //Input 1
    public boolean defaultInput1(){
        for (int i = 0; i < 4; i++){
            first = (i & 2) == 0;

        }
        return first;
    }

    //Input 2
    public boolean defaultInput2(){
        for (int i = 0; i < 4; i++){
            second = (i & 1) == 0;

        }
        return second;
    }

    //Usable Methods
    public String toString(){

        String strTable = "";

        for (int i = 0; i < 4; i++){
            first = (i & 2) == 0;
            second = (i & 1) == 0;
            strTable += String.format("%1$-5b %2$-5b\n", first, second);
            strTable += '\n';
        }
        return strTable;
    }
    public boolean equals(TruthTable object2){
        boolean status;
        if (first == object2.first && second == object2.second){
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    public TruthTable copy(){

        return new TruthTable();
    }

}