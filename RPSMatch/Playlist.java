
/**
 * Tests the Song class
 *
 * @author (Kandace Kellon)
 * @version (2022-09-29)
 */
public class Playlist
{
    public static void main(String[] args)
    {
        // songs with title, artist, and time in seconds
        Song Song1 = new Song ("Chain of fools", "Aretha Franklin",167);
        Song Song2 = new Song ("Party in the USA", "Miley Cyrus", 203);
        Song Song3 = new Song ("Pocket Full of Sunshine" , "Natasha Bedingfield" , 203);  
        Song Song4 = new Song ("Always be my Baby" , "Mariah Carey", 258);
        
        // prints out song names
        System.out.println(Song1);
        System.out.println(Song2);
        System.out.println(Song3);
        System.out.println(Song4);
        
        // adds total time together in seconds and prints total minutes
        double TotalMinutes = ((Song1.getTotalSeconds() + Song2.getTotalSeconds()+ Song3.getTotalSeconds() + Song4.getTotalSeconds())/60);
        System.out.println("\nTotal Minutes: " + TotalMinutes);


    
    
    
    
    }
}
