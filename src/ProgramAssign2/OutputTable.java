/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/10/17
 * Time: 12:25 PM
 */
package ProgramAssign2;

public class OutputTable {

    private boolean a;
    private boolean b;

    //Boolean Methods
    public boolean NOT(){
        for (int i = 0; i < 4; i++) {
            a = (i & 2) == 0;
            b = (i & 1) == 0;
        }
        return !(a);
    }
    public boolean AND(){
        for (int i = 0; i < 4; i++) {
            a = (i & 2) == 0;
            b = (i & 1) == 0;
        }
        return (a && b);
    }
    public boolean OR(){
        for (int i = 0; i < 4; i++) {
            a = (i & 2) == 0;
            b = (i & 1) == 0;
        }
        return (a || b);
    }
    public boolean XOR(){
        for (int i = 0; i < 4; i++) {
            a = (i & 2) == 0;
            b = (i & 1) == 0;
        }
        return (a ^ b);
    }
    public boolean NAND(){
        for (int i = 0; i < 4; i++) {
            a = (i & 2) == 0;
            b = (i & 1) == 0;
        }
        return !(a && b);
    }
    public boolean NOR(){
        for (int i = 0; i < 4; i++) {
            a = (i & 2) == 0;
            b = (i & 1) == 0;
        }
        return !(a || b);
    }

    //To String Method
    public String toStringNOT(){

        String strTable = "";

        for (int i = 0; i < 4; i++){
            a = (i & 2) == 0;
            b = (i & 1) == 0;
            strTable += String.format("%-6b\n", (!a));
            strTable += '\n';
        }
        return strTable;
    }
    public String toStringAND(){

        String strTable = "";

        for (int i = 0; i < 4; i++){
            a = (i & 2) == 0;
            b = (i & 1) == 0;
            strTable += String.format("%-6b\n", (a && b));
            strTable += '\n';
        }
        return strTable;
    }
    public String toStringOR(){

        String strTable = "";

        for (int i = 0; i < 4; i++){
            a = (i & 2) == 0;
            b = (i & 1) == 0;
            strTable += String.format("%-6b\n", (a || b));
            strTable += '\n';
        }
        return strTable;
    }
    public String toStringXOR(){

        String strTable = "";

        for (int i = 0; i < 4; i++){
            a = (i & 2) == 0;
            b = (i & 1) == 0;
            strTable += String.format("%-6b\n", (a ^ b));
            strTable += '\n';
        }
        return strTable;
    }
    public String toStringNAND(){

        String strTable = "";

        for (int i = 0; i < 4; i++){
            a = (i & 2) == 0;
            b = (i & 1) == 0;
            strTable += String.format("%-6b\n", !(a && b));
            strTable += '\n';
        }
        return strTable;
    }
    public String toStringNOR(){

        String strTable = "";

        for (int i = 0; i < 4; i++){
            a = (i & 2) == 0;
            b = (i & 1) == 0;
            strTable += String.format("%-6b\n", !(a || b));
            strTable += '\n';
        }
        return strTable;
    }

}