/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 12/11/17
 * Time: 5:40 PM
 */
package ProgramAssign3;

public class Story {

    public static void main(String args[]) {

        //The weight of the sleigh
        int sleigh = 128;

        //calls from the children classes
        Child1 jeremy = new Child1();
        Child2 kevin = new Child2();
        Child3 mindy = new Child3();

        //calls from the item and object classes
        Santa santa = new Santa();
        Helper elf = new Helper(4);
        Coal coal = new Coal(1);
        ActionFigure figure = new ActionFigure(1);
        Robot robo = new Robot(1);

        //prints the initial amount of each item
        System.out.println(santa.getElf());
        System.out.println(santa.getWeight() + " lbs\n");
        System.out.println(elf.getElf());
        System.out.println("Amount: " + elf.getAmt());
        System.out.println(elf.getWeight() + " lbs\n");
        System.out.println(coal.getToy());
        System.out.println("Amount: " + coal.getAmt());
        System.out.println(coal.getWeight() + " lbs\n");
        System.out.println(figure.getToy());
        System.out.println("Tracking Number: " + figure.getTrackNum());
        System.out.println("Amount: " + figure.getAmt());
        System.out.println(figure.getWeight() + " lbs\n");
        System.out.println(robo.getToy());
        System.out.println("Tracking Number: " + robo.getTrackNum());
        System.out.println("Amount: " + robo.getAmt());
        System.out.println(robo.getWeight() + " lbs\n");
        System.out.println("The initial weight of the sleigh is: " + sleigh + " lbs\n");

        //prints the story
        System.out.println("All through the day kids are excited for the night.\n" +
                "They wait for Santa Claus who is anything but delight.\n" +
                "However, not everything is delightful, for the night could give a fright.\n" +
                "If you were naughty, Santa will give you coal and not the present " +
                "you asked for that year.\n");

        System.out.println("The main children this story will focus on will be: \n" +
                jeremy.getChild() + "\n" +
                kevin.getChild() + "\n" +
                mindy.getChild() + "\n");

        System.out.println("Santa walks around in deep thought.\n" +
                "He hasnt gone through his list for that year and fears the worst.\n" +
                "Luckily he remembered he has someone with just the fix.\n" +
                "For he still had someone to make a database for him , oh the delight.\n");

        System.out.println("The current weight of the sleigh is: "
                + (sleigh + santa.getWeight() + elf.getWeight() + coal.getWeight() +
                figure.getWeight() + robo.getWeight()) + " lbs\n");

        System.out.println("With the weight calculated for the sleigh Santa puts the toys " +
                "in the sleigh and begins calls the reindeer before taking off in the night.\n");


            System.out.println("The current weight of the sleigh is: "
                    + (sleigh + santa.getWeight() + elf.getWeight() +
                    figure.getWeight() + robo.getWeight()) + " lbs\n");

            System.out.println("Leaving the first house in dismay, Santa hopes he'd be a good boy next year.\n");


            robo.setAmt(robo.getAmt() - 1);
            System.out.println(robo.getTrackNum() + " Added to database.");
            System.out.println("The current weight of the sleigh is: "
                    + (sleigh + santa.getWeight() + elf.getWeight() +
                    figure.getWeight()) + " lbs\n");

            System.out.println("Leaving the second house, Santa can fly more steadier than before.\n");

            figure.setAmt(figure.getAmt() - 1);
            System.out.println(figure.getTrackNum() + " Added to database.");
            System.out.println("The current weight of the sleigh is: "
                    + (sleigh + santa.getWeight() + elf.getWeight()) + " lbs\n");

            System.out.println("Leaving the following Santa finally returns to his shine.\n" +
                    "'There are still good kids these days,' he boasts.\n" +
                    "But his night is far from over.");
    }
}