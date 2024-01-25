package org.example;

public enum Floor {
    ENTRANCE(0), FIRST(1), SECOND(2), THIRD(3), FOURTH(4), FIFTH(5);

    private final int intFloor;

    Floor(int intFloor) {
        this.intFloor = intFloor;
    }

    int getIntFloor() {
        return intFloor;
    }

    Floor increase() {
        Floor upperFloor;
        if(this == ENTRANCE) {
            upperFloor = FIRST;
        } else if (this == FIRST) {
            upperFloor = SECOND;
        } else if (this == SECOND) {
            upperFloor = THIRD;
        } else if (this == THIRD) {
            upperFloor = FOURTH;
        } else {
            upperFloor = FIFTH;
        }
        return upperFloor;
    }

    Floor decrease() {
        Floor lowerFloor;
        if (this == FIFTH) {
            lowerFloor = FOURTH;
        } else if (this == FOURTH) {
            lowerFloor = THIRD;
        } else if (this == THIRD) {
            lowerFloor = SECOND;
        } else if (this == SECOND) {
            lowerFloor = FIRST;
        } else {
            lowerFloor = ENTRANCE;
        }
        return lowerFloor;
    }

    @Override
    public String toString(){
        String string;
        string = "Floor: " + getIntFloor();
        return string;
    }
 }
