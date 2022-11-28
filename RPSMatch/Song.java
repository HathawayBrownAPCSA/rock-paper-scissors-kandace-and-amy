
/**
 * Write a description of class Store here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song

{
    // instance variables - title, artist, timeSeconds
    private String title; 
    private String artist; 
    private double timeSeconds;

    /**
     * Constructor for objects of class Song
     */
    public Song(String titl, String art, double time)
    {
        title = titl;
        artist = art;
        timeSeconds = time;

    }
    /** 
     * @return time in Seconds
     */
    public double getTotalSeconds()
    {
        return timeSeconds;
    }
    /**
     * set seconds equal to n
     */
    public void setSeconds(int n)
    {
        timeSeconds = n;
    }
    /**
     * @return title plus artist plus time in Seconds
     */
        public String toString()
    {
        return title + "\t" + artist + "\t" + timeSeconds  + "(seconds)";
        
    }
}
