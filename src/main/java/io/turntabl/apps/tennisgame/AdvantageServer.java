package io.turntabl.apps.tennisgame;

public class AdvantageServer implements ResultProvider {

    private final TennisGame game;
    private final ResultProvider nextResult;

    public AdvantageServer(TennisGame game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.serverHasAdvantage())
            return new TennisResult("Advantage " + game.server, "");
        return this.nextResult.getResult();
    }
}
