package com.edu.uptc.backenduptc.model.entities;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

public class Classroom implements Serializable {
    private Integer id;
    private Integer numClassRoom;
    private String measures;

    private Integer numberDesks;

    private Board board;
    private LocalDateTime dateUpdate;

    public Classroom() {
    }

    public Classroom(Integer id, Integer numClassRoom, String measures, Integer numberDesks, Board board) {
        this.id = id;
        this.numClassRoom = numClassRoom;
        this.measures = measures;
        this.numberDesks = numberDesks;
        this.board = board;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumClassRoom() {
        return numClassRoom;
    }

    public void setNumClassRoom(Integer numClassRoom) {
        this.numClassRoom = numClassRoom;
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures;
    }

    public Integer getNumberDesks() {
        return numberDesks;
    }

    public void setNumberDesks(Integer numberDesks) {
        this.numberDesks = numberDesks;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public LocalDateTime getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(LocalDateTime dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", numClassRoom=" + numClassRoom +
                ", measures='" + measures + '\'' +
                ", numberDesks=" + numberDesks +
                ", board=" + board +
                ", dateUpdate=" + dateUpdate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return id.equals(classroom.id) && numClassRoom.equals(classroom.numClassRoom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numClassRoom);
    }
}
