package com.codegym;

public class TennisGame {

    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore = LOVE;
        int payer1Score = m_score1;
        int player2Score = m_score2;
        if (payer1Score == player2Score) {
            score = equalScore(payer1Score);
        } else {
            boolean isgetMoreThanScore = payer1Score >= 4 || player2Score >= 4;
            if (isgetMoreThanScore) {
                score = moreThanScore(payer1Score, player2Score);
            } else {
                score = getScoreFor2Player(payer1Score, score, player2Score);
            }
        }
        return score;
    }

    private static String getScoreFor2Player(int payer1Score, String score, int player2Score) {
        int tempScore;
        for (int i = FIFTEEN; i < FORTY; i++) {
            if (i == FIFTEEN) tempScore = payer1Score;
            else {
                score += "-";
                tempScore = player2Score;
            }
            switch (tempScore) {
                case LOVE:
                    score += "Love";
                    break;
                case FIFTEEN:
                    score += "Fifteen";
                    break;
                case THIRTY:
                    score += "Thirty";
                    break;
                case FORTY:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String moreThanScore(int payer1Score, int player2Score) {
        String score;
        int minusResult = payer1Score - player2Score;
        if (minusResult == FIFTEEN) score = "Advantage player1";
        else if (minusResult == -FIFTEEN) score = "Advantage player2";
        else if (minusResult >= THIRTY) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String equalScore(int payer1Score) {
        String score;
        switch (payer1Score) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }
}