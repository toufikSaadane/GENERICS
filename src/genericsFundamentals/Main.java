package genericsFundamentals;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer  pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> ajax = new Team<>("Ajax Amsterdam");
        ajax.addPlayer(joe);

        Team<BaseballPlayer> baseballTeam = new Team<>("Baseball Team");
        Team<BaseballPlayer> baseballTeamTwo = new Team<>("Baseball Team two");
        Team<BaseballPlayer> baseballTeamThree = new Team<>("Baseball Team Three");

        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerTeam = new Team<>("Soccer team");
        Team<SoccerPlayer> soccerTeam2 = new Team<>("Soccer team 2");
        Team<SoccerPlayer> soccerTeam3 = new Team<>("Soccer team 3");

//        baseballTeam.matchResult(baseballTeamTwo, 230, 43);
//        baseballTeam.matchResult(baseballTeamThree, 23, 54);

        System.out.println("=====================");

        soccerTeam.matchResult(soccerTeam2, 3, 14);
        soccerTeam.matchResult(soccerTeam3, 8, 19);
        soccerTeam2.matchResult(soccerTeam3, 13, 5);

        System.out.println("===================== Ranking");
        System.out.println(soccerTeam.getName()+" : "+soccerTeam.ranking());
        System.out.println(soccerTeam2.getName()+" : "+soccerTeam2.ranking());
        System.out.println(soccerTeam3.getName()+" : "+soccerTeam3.ranking());

        System.out.println("===================== Compare");
        System.out.println(soccerTeam.compareTo(soccerTeam2));;

    }
}
