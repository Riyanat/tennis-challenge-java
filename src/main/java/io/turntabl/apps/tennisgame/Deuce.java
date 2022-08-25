package io.turntabl.apps.tennisgame;

public class Deuce implements ResultProvider {
    private final TennisGame game;
    private final ResultProvider nextResult;

    public Deuce(TennisGame game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.isDeuce())
            return new TennisResult("Deuce", "");
        return this.nextResult.getResult();
    }
}
