package com.pluralsight;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest
{
    @Test
    public void shouldSetToCleanRegardlessOfCurrentisDirty()
    {
        //arrange
        Room testRoom = new Room("Standard", 2, 79.99);
        Room testRoom2 = new Room("Standard", 3, 99.99);
        testRoom.setDirty(true); //room is dirty and will be cleaned
        testRoom2.setDirty(false); //room is not dirty but cleanRoom() should still set to clean
        //act
        testRoom.cleanRoom();
        testRoom2.cleanRoom();
        //assert
        Assertions.assertEquals(false, testRoom.isDirty(),
                "because cleanRoom() is supposed to set room to isDirty false");
        Assertions.assertEquals(false, testRoom2.isDirty(),
                "because cleanRoom() is supposed to set room to isDirty false");
    }

}