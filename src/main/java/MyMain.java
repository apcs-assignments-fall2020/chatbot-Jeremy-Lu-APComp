//CHATBOT PROGRAM _ Jeremy Lu AP Computer Science -- Assignment 1
import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your name? "); // prompts user name
        String string_Name = scan.next();
        System.out.println("Nice to meet you " + string_Name + "!"); // outprints greeting
        System.out.println("What is your favorite number? "); // prompts user favorite color
        String integer_number = scan.next();
        System.out.println(string_Name + ", I like " + integer_number + " as well!"); // outprints color_msg
        System.out.println("What is your favorite food? "); // prompts user favorite food
        String string_Food = scan.next();
        System.out.println("That's awesome " + string_Name + " I like " + string_Food + " as well!"); // outprints food_msg
        System.out.println("What is your favorite time of day? "); // outprints user favorite time
        String string_daytime = scan.next();
        System.out.println("Me too! I like " + string_daytime + " as well!"); // outprints day_msg
        System.out.println("What is your favorite color? "); // prompts user favorite color
        String string_color = scan.next();
        System.out.println("I love " + string_color + " as well!"); // outprints user color_msg
        scan.close();
        System.out.println("Goodbye world!"); // exit
    }
}
