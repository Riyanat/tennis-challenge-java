package io.turntabl.apps.tennisgame;

public class GameReceiver implements ResultProvider {

    private final TennisGame game;
    private final ResultProvider nextResult;

    public GameReceiver(TennisGame game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.receiverHasWon())
            return new TennisResult("Win for " + game.receiver, "");
        return this.nextResult.getResult();
    }
}
