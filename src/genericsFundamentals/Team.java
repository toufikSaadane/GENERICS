package genericsFundamentals;

import java.util.ArrayList;

public class Team<T extends Player & PlayerInterface>  implements Comparable<Team<T>>{

    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (members.contains(player)){
            System.out.println(player.getName() + " is already added to team members");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " is now a member of " + name);
            return true;
        }
    }

    public int numPlayers(){
        return members.size();
    }

    public void matchResult(Team<T> opponentTeams, int thereResult, int ourResult){

        String message;

        if (thereResult > ourResult){
            lost++;
            message = " lost to ";
        } else if (thereResult == ourResult) {
            tied++;
            message = " drew with ";
        }else {
            won++;
            message = " won ";
        }
        played++;
        if (opponentTeams != null){
            System.out.println(getName() + message + opponentTeams.getName());
            opponentTeams.matchResult(null, thereResult, ourResult);
        }

    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> o) {
        if (ranking() > o.ranking()){
            return -1;
        } else if (ranking() < o.ranking()) {
            return 1;
        }else {
            return 0;
        }

    }
}
