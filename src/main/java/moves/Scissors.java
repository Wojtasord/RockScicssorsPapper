package moves;

public class Scissors implements MovesStrategy {
    private ActionName name;

    public Scissors() {
        name = ActionName.SCISSORS;
    }

    @Override
    public boolean isLoosingWith(MovesStrategy playerMove) {
        return playerMove.getName() == ActionName.ROCK;
    }

    @Override
    public boolean isWinningWith(MovesStrategy playerMove) {
        return playerMove.getName() == ActionName.PAPER;
    }

    @Override
    public ActionName getName() {
        return name;
    }
}
