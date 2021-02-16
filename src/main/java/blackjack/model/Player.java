package blackjack.model;

public interface Player {
    Job getJob();

    String getName();

    void receiveCard();

    Pocket getCardStats();

    String exportCardStats();

    int getTotalScore();

    boolean hasAce();
}