package com.edu.uptc.backenduptc.model.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name="classrooms")
public class Classroom implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "num_classroom", nullable = false)
    private Integer numClassRoom;
    @Column(name = "measures_mt2")
    private String measures;
    @Column(name="number_desks")
    private Integer numberDesks;
    @Column(name="Board_type")
    @Enumerated(EnumType.STRING)
    private Board board;
    @Column(name = "date_update")
    private LocalDateTime dateUpdate;
    @Column(name = "date_up")
    private LocalDateTime dateUp;

    @ManyToOne(optional = true,cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinColumn(name = "pabellon_id",foreignKey = @ForeignKey(name = "FK_PABELLON_ID") )
    private Pabellon pabellon;

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

    public LocalDateTime getDateUp() {
        return dateUp;
    }

    public void setDateUp(LocalDateTime dateUp) {
        this.dateUp = dateUp;
    }

    public Pabellon getPabellon() {
        return pabellon;
    }

    public void setPabellon(Pabellon pabellon) {
        this.pabellon = pabellon;
    }
    @PrePersist
    public void beginPersist(){
        this.dateUp = LocalDateTime.now();

    }
    @PreUpdate
    public void beginUpdatePersist(){
        this.dateUpdate = LocalDateTime.now();
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
