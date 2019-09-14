package ProgramAssign1;

/**
 * Created by Nkem Ohanenye on 9/26/2017.
 */
public class TestPasswordChecker {

    public static void main(String[] args) {

        Password passwordChecker = new Password();

        passwordChecker.setPassword("RedFox");

        passwordChecker.checkPassword();



        passwordChecker.setPassword("Red22Fox");

        passwordChecker.checkPassword();



        passwordChecker.setPassword("&Red2$2Fox");

        passwordChecker.checkPassword();

    }

}
