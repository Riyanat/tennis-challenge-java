package io.turntabl.apps.tennisgame;

public class DefaultResult implements ResultProvider {

    private static final String[] scores = { "Love", "Fifteen", "Thirty", "Forty" };

    private final TennisGame game;

    public DefaultResult(TennisGame game) {
        this.game = game;
    }

    @Override
    public TennisResult getResult() {
        return new TennisResult(scores[game.serverScore], scores[game.receiverScore]);
    }
}
