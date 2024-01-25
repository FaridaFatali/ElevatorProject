package org.example;

public class ResponsibleElevatorTest {
    public static void main(String[] args) {
        Elevator elevator = new ResponsibleElevator();
        elevator.openDoor();  // Get into the elevator
        elevator.go(Floor.FIFTH);
        System.out.println();
        elevator.openDoor();  // If somebody comes
        elevator.go(Floor.FIRST);
        System.out.println();
        elevator.go(Floor.FIFTH);
    }
}
