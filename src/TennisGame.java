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
