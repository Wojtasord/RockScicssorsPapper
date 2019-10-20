package moves;

import javax.swing.*;

public class Rock implements MovesStrategy {

    private ActionName name;

    public Rock() {
        name = ActionName.ROCK;
    }

    @Override
    public ActionName getName() {
        return name;
    }

    @Override
    public boolean isLoosingWith(MovesStrategy playerMove) {
        return playerMove.getName() == ActionName.PAPER;
    }

    @Override
    public boolean isWinningWith(MovesStrategy playerMove) {
        return playerMove.getName() == ActionName.SCISSORS;
    }


}
