package ProgramAssign1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Nkem Ohanenye on 9/26/2017.
 */
public class Password {

    private final int index = 3; //creates index of string array
    private String[] password = new String[index]; //creates the sting array
    private String passwordString; // creates a string

    //sets the password
    public void setPassword(String pass) {
        for (String fix : this.password) {   //allows for sting array to equal a string
            fix = pass;
            pass = fix;
        }
        this.passwordString = pass; //allows the program to use the passwords outside the method
    }

    //checks the password
    public boolean checkPassword() {

        boolean goodPass = false;
        int length = passwordString.length(); //allows for easy use of length

        boolean hasUpperCase = !passwordString.equals(passwordString.toLowerCase());
        boolean hasLowerCase = !passwordString.equals(passwordString.toUpperCase());
        boolean hasNumericValue = passwordString.matches(".*\\d.*");
        String special = "[\\\\!\"#$%&()*+,./:;<=>?@\\[\\]^_{|}~]+";
        Pattern sChar = Pattern.compile(special);
        Matcher check = sChar.matcher(passwordString);
        boolean hasSCharacter = check.find();

        System.out.println(passwordString); // displays the passwords

        if (!goodPass) {

            /*
             * Checks for invalid Password
             */
            //First Check
            if (length < 8) {
                System.out.println("Bad Password.");
                System.out.println("Password is too short.");

                if (!hasUpperCase) {
                    System.out.println("Password needs at least one uppercase charcter.");
                    return hasUpperCase;
                }
                if (!hasLowerCase) {
                    System.out.println("Password needs at least one lowercase character");
                    return hasLowerCase;
                }
                if (!hasNumericValue) {
                    System.out.println("Password needs at least one number.");
                    return hasNumericValue;
                }
                if (!hasSCharacter) {
                    System.out.println("Password needs at least one special character.");
                    return hasSCharacter;
                }
                return true;
            }

            //Second Check
            if (!hasUpperCase) {
                System.out.println("Bad Password.");
                System.out.println("Password needs at least one uppercase charcter.");

                if (length < 8) {
                    System.out.println("Password is too short.");
                    return true;
                }
                if (!hasLowerCase) {
                    System.out.println("Password needs at least one lowercase character");
                    return hasLowerCase;
                }
                if (!hasNumericValue) {
                    System.out.println("Password needs at least one number.");
                    return hasNumericValue;
                }
                if (!hasSCharacter) {
                    System.out.println("Password needs at least one special character.");
                    return hasSCharacter;
                }
                return hasUpperCase;
            }

            //Third Check
            if (!hasLowerCase) {
                System.out.println("Bad Password.");
                System.out.println("Password needs at least one lowercase character");

                if (!hasUpperCase) {
                    System.out.println("Password needs at least one uppercase charcter.");
                    return hasUpperCase;
                }
                if (length < 8) {
                    System.out.println("Password is too short.");
                    return true;
                }
                if (!hasNumericValue) {
                    System.out.println("Password needs at least one number.");
                    return hasNumericValue;
                }
                if (!hasSCharacter) {
                    System.out.println("Password needs at least one special character.");
                    return hasSCharacter;
                }
                return hasLowerCase;
            }

            //Fourth Check
            if (!hasNumericValue) {
                System.out.println("Bad Password.");
                System.out.println("Password needs at least one number.");

                if (!hasUpperCase) {
                    System.out.println("Password needs at least one uppercase charcter.");
                    return hasUpperCase;
                }
                if (!hasLowerCase) {
                    System.out.println("Password needs at least one lowercase character");
                    return hasLowerCase;
                }
                if (length < 8) {
                    System.out.println("Password is too short.");
                    return true;
                }
                if (!hasSCharacter) {
                    System.out.println("Password needs at least one special character.");
                    return hasSCharacter;
                }
                return hasNumericValue;
            }

            //Fifth Check
            if (!hasSCharacter) {
                System.out.println("Bad Password.");
                System.out.println("Password needs at least one special character.");

                if (!hasUpperCase) {
                    System.out.println("Password needs at least one uppercase charcter.");
                    return hasUpperCase;
                }
                if (!hasLowerCase) {
                    System.out.println("Password needs at least one lowercase character");
                    return hasLowerCase;
                }
                if (!hasNumericValue) {
                    System.out.println("Password needs at least one number.");
                    return hasNumericValue;
                }
                if (length < 8) {
                    System.out.println("Password is too short.");
                    return true;
                }
                return hasSCharacter;
            }

            /*
             * Checks for valid Password
             */
            //First Check
            if (length >= 8) {
                System.out.println("Good Password");

                if (hasUpperCase) {
                    return hasUpperCase;
                }

                if (hasLowerCase) {
                    return hasLowerCase;
                }

                if (hasNumericValue) {
                    return hasNumericValue;
                }

                if (hasSCharacter) {
                    return hasSCharacter;
                }
                return true;
            }

            //Second Check
            if (hasUpperCase) {
                System.out.println("Good Password");

                if (length >= 8) {
                    return true;
                }

                if (hasLowerCase) {
                    return hasLowerCase;
                }

                if (hasNumericValue) {
                    return hasNumericValue;
                }

                if (hasSCharacter) {
                    return hasSCharacter;
                }
                return hasUpperCase;
            }

            //Third Check
            if (hasLowerCase) {
                System.out.println("Good Password");

                if (hasUpperCase) {
                    return hasUpperCase;
                }

                if (length >= 8) {
                    return true;
                }

                if (hasNumericValue) {
                    return hasNumericValue;
                }

                if (hasSCharacter) {
                    return hasSCharacter;
                }
                return hasLowerCase;
            }

            //Fourth Check
            if (hasNumericValue) {
                System.out.println("Good Password");

                if (hasUpperCase) {
                    return hasUpperCase;
                }

                if (hasLowerCase) {
                    return hasLowerCase;
                }

                if (length >= 8) {
                    return true;
                }

                if (hasSCharacter) {
                    return hasSCharacter;
                }
                return hasNumericValue;
            }

            //Fifth Check
            if (hasSCharacter) {
                System.out.println("Good Password");

                if (hasUpperCase) {
                    return hasUpperCase;
                }

                if (hasLowerCase) {
                    return hasLowerCase;
                }

                if (hasNumericValue) {
                    return hasNumericValue;
                }

                if (length >= 8) {
                    return true;
                }
                return hasSCharacter;
            }
        }
        return goodPass; //returns boolean
    }
}
