package org.ramin.javabrains;

public class Triangle {

    private String type;
    private int height;

    Triangle(String type) {
        this.type = type;
    }

    Triangle(int height) {
        this.height = height;
    }

    Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void draw() {
        System.out.println(getType() + " triangle drawn of height " + getHeight());
    }
}
