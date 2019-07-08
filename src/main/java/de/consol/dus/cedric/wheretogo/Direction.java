package de.consol.dus.cedric.wheretogo;

public enum Direction {
    NORTH("n"),
    SOUTH("s"),
    WEST("w"),
    EAST("e");

    private final String shortcut;

    Direction(String shortcut) {
        this.shortcut = shortcut;
    }

    public String getShortcut() {
        return shortcut;
    }

}
