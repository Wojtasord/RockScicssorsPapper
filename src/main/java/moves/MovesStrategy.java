package moves;

public interface MovesStrategy {
    boolean isLoosingWith(MovesStrategy playerMove);
    boolean isWinningWith(MovesStrategy playerMove);

    ActionName getName();
}
