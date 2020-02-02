package main;

import java.util.List;

public class SpreadSheet {

    private Integer rows;
    private Integer columns;
    private List<Cell> cells;

    public SpreadSheet(Integer rows, Integer columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public List<Cell> getCells() {
        return cells;
    }

    public void setCells(List<Cell> cells) {
        this.cells = cells;
    }
}
