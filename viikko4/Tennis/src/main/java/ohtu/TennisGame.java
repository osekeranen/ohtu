package ohtu;

public class TennisGame {
    
    private String player1Name;
    private int player1_score = 0;
    private String player2Name;
    private int player2_score = 0;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void point(String playerName) {
        if (playerName == "player1")
            player1_score += 1;
        else
            player2_score += 1;
    }

    public String getScore() {
        String score;
        if (player1_score == player2_score) {
            score = tie(player1_score);
        } else if (player1_score >=4 || player2_score >=4) {
            score = advantage(player1_score, player2_score);
        } else {
            score = normal(player1_score, player2_score);
        }
        return score;
    }

    private String score(int score) {
        String toString;
        if (score == 0) {
            toString = "Love";
        } else if (score == 1) {
            toString = "Fifteen";
        } else if (score == 2) {
            toString = "Thirty";
        } else {
            toString = "Forty";
        }
        return toString;
    }

    private String normal(int score1, int score2) {
        return score(score1)+"-"+score(score2);
    }

    private String tie(int score) {
        String toString;
        if (score <= 3) {
            toString = score(score)+"-All";
        } else {
            toString = "Deuce";
        }
        return toString;
    }

    private String advantage(int score1, int score2) {
        String toString;
        int difference = score1 - score2;
        if (difference==1) {
            toString ="Advantage player1";
        } else if (difference ==-1) {
            toString ="Advantage player2";
        } else if (difference>=2) {
            toString = "Win for player1";
        } else {
            toString ="Win for player2";
        }
        return toString;
    }
}