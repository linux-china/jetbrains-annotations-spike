package org.mvnsearch;

/**
 * Tag
 *
 * @author linux_china
 */
public class Tag {
    public static final int TOP = 1;
    public static final int CENTER = 2;
    public static final int BOTTOM = 3;
    public static final int LEFT = 4;
    public static final int RIGHT = 5;
    private int position;

    public void textPosition(@TextPosition int position) {
        this.position = position;
    }

    @TextPosition
    public int getTextPosition() {
        return this.position;
    }

    public static void main(String[] args) {
        Tag tag = new Tag();
        @TextPosition int position = BOTTOM;
        tag.textPosition(1);
    }
}
