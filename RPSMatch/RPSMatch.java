
/**
 * Write a description of class RPSMatch here.
 *
 * @author (Kandace and Amy)
 * @version (10/24/22)
 */
public class RPSMatch
{
    // instance variables - replace the example below with your own
    //private instance variables
    private String humanPlay;
    private String computerPlay;
    private int humanWins; 
    private int computerWins;
    private int ties; 
    private String result;

    /**
     * Constructor for objects of class RPSMatch
     */
    public RPSMatch()
    {
        humanWins = 0;
        computerWins = 0;
        ties = 0;
    }
    void setHumanPlay (String Hp)
    {
      humanPlay = Hp;
    }
    /* cheating version */
    public String getComputerPlay()
    {
        if (humanPlay == "rock")
        {
            computerPlay = "paper";
        } 
        else if (humanPlay == "scissors")
        {
            computerPlay = "rock";
        }
        else 
        {
            computerPlay = "scissors";
        }
        return computerPlay;
    }

   /* non-cheating version 
    public String getComputerPlay()
    {
        int cP = (int)(Math.random() * 3 + 1);
        if (cP == 1)
        {
            computerPlay = "rock";
        } 
        else if (cP == 2)
        {
            computerPlay = "paper";
        }
        else 
        {
            computerPlay = "scissors";
        }
        return computerPlay;
    }
    */
    public String getResult()
    {
        if (humanPlay == computerPlay)
        {
            ties += 1;
            return "It's a tie.";
        }
        else if (humanPlay == "rock" && computerPlay == "paper")
        {
            computerWins += 1;
            return "You loose! Haha";
        }
        else if (humanPlay == "paper" && computerPlay == "rock")
        {
            humanWins += 1;
            return "You win :(";
        }
        else if (humanPlay == "rock" && computerPlay == "scissors")
        {
            humanWins += 1;
            return "You win :(";
        }
        else if (humanPlay == "scissors" && computerPlay == "rock")
        {
            computerWins += 1;
            return "You loose! Haha"; 
        }
        else if (humanPlay == "scissors" && computerPlay == "paper")
        {
            humanWins += 1;
            return "You win :(";
        }
        else if (humanPlay == "paper" && computerPlay == "scissors")
        {
            computerWins += 1;
            return "You loose! Haha";
        }
        else
        {
            return result;
        }
    }
    
    public int getHumanWins()
    {
        return humanWins;
    }
    
    public int getComputerWins()
    {
        return computerWins;
    }
    
    public int getTies()
    {
        return ties;
    }
}

