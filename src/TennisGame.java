/*
public class TennisGame {

    public static String getScore(String namePlayerOne, String namePlayerTwo,
                                  int scorePlayerOne, int scorePlayerTwo) {
        final int ZERO = 0;
        final int A_POINT = 1;
        final int TWO_POINTS = 2;
        final int THREE_POINTS = 3;
        final int FOUR_POINTS = 4;
        String score = "";
        int tempScore = ZERO;
        boolean equalScores = scorePlayerOne == scorePlayerTwo;
        int minusResult = scorePlayerOne - scorePlayerTwo;
        
        if (equalScores) {
            switch (scorePlayerOne) {
                case ZERO:
                    score = "Love-All";
                    break;
                case A_POINT:
                    score = "Fifteen-All";
                    break;
                case TWO_POINTS:
                    score = "Thirty-All";
                    break;
                case THREE_POINTS:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }
        } else {
            boolean scoreGreaterFour = scorePlayerOne >= FOUR_POINTS || scorePlayerTwo >= FOUR_POINTS;
            if (scoreGreaterFour) {
                if (minusResult == A_POINT) {
                    score = "Advantage player1";
                } else if (minusResult == -A_POINT) {
                    score = "Advantage player2";
                } else if (minusResult >= TWO_POINTS) {
                    score = "Win for player1";
                } else {
                    score = "Win for player2";
                }
            } else {
                for (int i = A_POINT; i < THREE_POINTS; i++) {
                    if (i == A_POINT) tempScore = scorePlayerOne;
                    else {
                        score += "-";
                        tempScore = scorePlayerTwo;
                    }
                    switch (tempScore) {
                        case ZERO:
                            score += "Love";
                            break;
                        case A_POINT:
                            score += "Fifteen";
                            break;
                        case TWO_POINTS:
                            score += "Thirty";
                            break;
                        case THREE_POINTS:
                            score += "Forty";
                            break;
                    }
                }
            }
        }
        return score;
    }
}
*/
public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int scorePlayer1, int ScorePlayer2) {
        String score = "";
        int tempScore = 0;
        boolean scoreEqual = scorePlayer1 == ScorePlayer2;
        if (scoreEqual) {
            score = getScore(scorePlayer1);
        } else {
            boolean scoreGreater4 = scorePlayer1 >= 4 || ScorePlayer2 >= 4;
            if (scoreGreater4) {
                score = getScore(scorePlayer1, ScorePlayer2);
            } else {
                for (int i = 1; i < 3; i++) {
                    if (i == 1) {
                        tempScore = scorePlayer1;
                    }
                    else {
                        score += "-";
                        tempScore = ScorePlayer2;
                    }
                    score = getScore(score, tempScore);
                }
            }
        }
        return score;
    }

    private static String getScore(int scorePlayer1, int ScorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - ScorePlayer2;
        if (minusResult == 1) {
            score = "Advantage player1";
        }
        else if (minusResult == -1) {
            score = "Advantage player2";
        }
        else if (minusResult >= 2) {
            score = "Win for player1";
        }
        else {
            score = "Win for player2";
        }
        return score;
    }

    private static String getScore(String score, int tempScore) {
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }

    private static String getScore(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}