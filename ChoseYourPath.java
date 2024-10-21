import java.util.Scanner;

public class ChoseYourPath {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Scene 1
    System.out.println(
        "You wake up in a long creepy hallway with nothing but a mad lib booklet and a pencil. You look down at the paper.");

    // mad lib part
    String madLib = "I wanted to eat a <noun> but the <adjective> <animal> chased me away.";

    // Indexes/Lengths
    int openingBracketIndex = madLib.indexOf("<");
    int closingBracketIndex = madLib.indexOf(">");
    int openingBracketIndex2 = madLib.indexOf("<", openingBracketIndex + 1);
    int closingBracketIndex2 = madLib.indexOf(">", closingBracketIndex + 1);
    int openingBracketIndex3 = madLib.indexOf("<", openingBracketIndex2 + 1);
    int closingBracketIndex3 = madLib.indexOf(">", closingBracketIndex2 + 1);
    int totalLength = madLib.length();

    // prompts the user to enter the first word
    System.out.println("Enter a " + madLib.substring(openingBracketIndex + 1, closingBracketIndex));
    // stores entered word
    String userInput1 = sc.nextLine();

    // prompts the user to enter the second word
    System.out.println("Enter a " + madLib.substring(openingBracketIndex2 + 1, closingBracketIndex2));
    // stores entered word
    String userInput2 = sc.nextLine();

    // prompts the user to enter the third word
    System.out.println("Enter a " + madLib.substring(openingBracketIndex3 + 1, closingBracketIndex3));
    // stores entered word
    String userInput3 = sc.nextLine();

    // Substituting responses in
    String partOne = (madLib.substring(0, openingBracketIndex) + userInput1);
    String partTwo = (madLib.substring(closingBracketIndex + 1, openingBracketIndex2) + userInput2);
    String partThree = (madLib.substring(closingBracketIndex2 + 1, openingBracketIndex3) + userInput3);
    String partFour = (madLib.substring(closingBracketIndex3 + 1, totalLength));

    // Output concatination
    System.out.println(partOne + partTwo + partThree + partFour);

    // Scene 2
    System.out.println("You look up. A " + userInput2 + " " + userInput3 + " is charging at you.");
    // prompt 2
    System.out.println("Will you dodge (yes/no)");
    String answer = sc.nextLine();

    // decision 1
    if (answer.equals("yes")) {
      System.out.println("You dodge. The " + userInput2 + " " + userInput3 + " is very sad. Look what you did.");
      System.out.println("Do you comfort the " + userInput2 + " " + userInput3 + " or do you gloat? (comfort/gloat)");
      answer = sc.nextLine();
    }
    // decision 1 line 1
    if (answer.equals("comfort")) {
      System.out.println(
          "You comfort the " + userInput2 + " " + userInput3 + ". Suddenly, Aaron Rodgers knocks on the door.");
      System.out.println("Do you open it? (yes/no)");
      answer = sc.nextLine();

    }
    // decision 1 line 2
    else if (answer.equals("gloat")) {
      System.out.println("You gloat in front of the " + userInput2 + " " + userInput3 + ". It begins to cry.");
      System.out.println("Do you help it? (yes/no)");
      answer = sc.nextLine();
    }

    // decision 2
    else if (answer.equals("no")) {
      System.out.println("You stand still. The " + userInput2 + " " + userInput3
          + " runs up to you and gives you a hug. You are now friends");
    }
  }
}
