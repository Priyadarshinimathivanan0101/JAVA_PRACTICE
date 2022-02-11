interface ISports
{
    public void SetTeam(String t1,String t2, int score1, int score2);
    public void ShowResult();
}
    
class Cricket implements ISports
{
    int team1Runs,team2Runs;
    String team1,team2;
    public void SetTeam(String t1,String t2, int r1, int r2)
    {
        team1 = t1;
        team2 = t2;
        team1Runs = r1;
        team2Runs = r2;
    }
    public void ShowResult()
    {
        System.out.println(team1 + "-" + team1Runs + " Runs");
		System.out.println(team2 + "-" + team2Runs + " Runs");

    }
}
class Hockey implements ISports
{
    String team1,team2;
    int team1Goals,team2Goals;
    public void SetTeam(String t1,String t2, int r1, int r2)
    {
        team1 = t1;
        team2 = t2;
        team1Goals = r1;
        team2Goals = r2;
    }
    
    public void ShowResult()
    {
        System.out.println(team1 + "-" + team1Goals + " Goals");
		System.out.println(team2 + "-" + team2Goals + " Goals");

    }
}
public class InterfaceDemo
{
    public static void main(String[] arg)
    {
        Cricket c = new Cricket();
        Hockey h = new Hockey();
        c.SetTeam("India", "England",240,220);
		h.SetTeam("India", "Germany",3,2);
        c.ShowResult();
        h.ShowResult();
    }
}