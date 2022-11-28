
/**
 * First example of user input 
 *
 * @author Kandace Kellon
 * @version 2022-09-02
 */

import java.util.Scanner;

public class SayHello
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Proper noun");
        String propernoun1 = keyboard.nextLine();
        
        System.out.print("school subject");
        String schoolsubject1 = keyboard.nextLine();
        
        System.out.print("mystical being");
        String mysticalbeing1 = keyboard.nextLine();
        
        System.out.print("teacher name");
        String teachername1 = keyboard.nextLine();
        
        System.out.print("special power");
        String specialpower1 = keyboard.nextLine();
        
        System.out.print("verb");
        String verb1 = keyboard.nextLine();
        
        System.out.print("another teacher name");
        String teachername2 = keyboard.nextLine();
        
        System.out.print("another verb");
        String verb2 = keyboard.nextLine();
        
        
        
        
        
        
        
        
        
    
        
        System.out.println("Once upon a time there was a person named " + propernoun1 + " who had problems with " + schoolsubject1 + ".");
        System.out.println("so they went to a " + mysticalbeing1 + " who was called " + teachername1);
        System.out.println("They asked for " + specialpower1 + " that would grant them the ability to " + verb1 + " in class without " + teachername2 + " noticing ");
        System.out.println(mysticalbeing1 + " granted them " + specialpower1 + " and they were the happiest in the land, free to " + verb2 + " as they please.");
        
        
    }
}
