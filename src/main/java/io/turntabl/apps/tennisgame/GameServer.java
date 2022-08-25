package io.turntabl.apps.tennisgame;

public class GameServer implements ResultProvider {

    private final TennisGame game;
    private final ResultProvider nextResult;

    public GameServer(TennisGame game, ResultProvider nextResult) {
        this.game = game;
        this.nextResult = nextResult;
    }

    @Override
    public TennisResult getResult() {
        if (game.serverHasWon())
            return new TennisResult("Win for " + game.server, "");
        return this.nextResult.getResult();
    }
}
