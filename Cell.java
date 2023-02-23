public class Cell {
    final Position position;
    boolean isEmpty;

    public Cell(Position position) {
        this.position = position;
        this.isEmpty = true;
    }

    public Position getPosition() {
        return position;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

}

