
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private String nationality;
    private int assists;
    private int goals;
    private int penalties;
    private String team;
    private int games;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    @Override
    public String toString() {
        String toString = name;
        for (int i = 0; i < (20-name.length()); i++) {
            toString += " ";
        }
        toString += team + " ";
        if (goals >= 100) {
            toString += goals;
        } else if (goals >= 10) {
            toString += " " + goals;
        } else {
            toString += "  " + goals;
        }
        toString += " +";
        if (assists >= 100) {
            toString += assists;
        } else if (assists >= 10) {
            toString += " " + assists;
        } else {
            toString += "  " + assists;
        }
        toString += " =";
        if (goals+assists >= 100) {
            toString += (goals+assists);
        } else if (goals+assists >= 10) {
            toString += " " + (goals+assists);
        } else {
            toString += "  " + (goals+assists);
        }
        return toString;
    }

    @Override
    public int compareTo(Player player) {
        return (player.goals+player.assists) - (this.goals+this.assists);
    }
}
