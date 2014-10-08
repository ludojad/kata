/**
 * Created by Przemo on 2014-10-07.
 */

public class BowlingGame {

    private int rolls[] = new int[21];
    private int score;
    private int currentRoll;

    public void setScore(int score) {
        this.score = score;
    }

    public void roll(int pins){
        this.score += pins;
        rolls[this.currentRoll++] = pins;
    }

    public int getScore() {
        setScore(0);
        int frameIndex = 0;
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)){
                score += roundScoreStrike(frameIndex);
                frameIndex += 1;
            }
            else if (isSpare(frameIndex)) {
                score += roundScoreSpare(frameIndex);
                frameIndex += 2;
            } else {
                score += roundScore(frameIndex);
                frameIndex += 2;
            }
        }
        return this.score;
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private int roundScoreSpare(int frameIndex) {
        return 10 + rolls[frameIndex + 2];
    }

    private int roundScoreStrike(int frameIndex) {
        return 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private int roundScore(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }
}
