package boardgame;

import java.io.Serial;

public class Position {
    private Integer row;
    private Integer column;

    public Position(Integer row, Integer column) {
        setRow(row);
        setColumn(column);
    }

    public Integer getRow() {
        return row;
    }
    public void setRow(Integer row) {
        this.row = row;
    }
    public Integer getColumn() {
        return column;
    }
    public void setColumn(Integer column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return this.row + ", " + this.column;
    }
}
