package io.turntabl.apps.tennisgame;

public class AdvantageReceiver implements ResultProvider {

    private final TennisGame game;
    private final ResultProvider nextResult;

    public AdvantageReceiver(TennisGame game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.receiverHasAdvantage())
            return new TennisResult("Advantage " + game.receiver, "");
        return this.nextResult.getResult();
    }
}
