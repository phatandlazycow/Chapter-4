
public class Team
{
    private String teamName;
    private Athlete[] players;
    public Team(int size,String nm){
        this.players = new Athlete[size];
        this.teamName = nm;
    }
    public void addAthlete(int index,Athlete a){
        players[index] = a;
    }
    public String toString(){
        String output = "The team "+ teamName +" has the following: \n" ;
        for(Athlete a : players){
            output += a+"\n";
        }
        return output;
    }
}
