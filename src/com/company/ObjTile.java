package com.company;

public class ObjTile {
    private String state; // -1 = border, 0 = empty, 1 = white, 2 = black
    private int x;
    private int y;

    public ObjTile(String state, int x, int y) {
        this.state = state;
        this.x = x;
        this.y = y;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
