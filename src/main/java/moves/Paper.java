package moves;

public class Paper implements MovesStrategy {
    private ActionName name;

    public Paper() {
        name = ActionName.PAPER;
    }

    @Override
    public ActionName getName() {
        return name;
    }

    @Override
    public boolean isLoosingWith(MovesStrategy playerMove) {
        return playerMove.getName() == ActionName.SCISSORS;
    }

    @Override
    public boolean isWinningWith(MovesStrategy playerMove) {
        return playerMove.getName() == ActionName.ROCK;
    }

}
