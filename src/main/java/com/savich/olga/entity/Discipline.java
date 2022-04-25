package com.savich.olga.entity;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;;

@Entity
@Table(name = "disciplines")
public class Discipline {
    private int id;
    private String disciplineName;
    private BigDecimal costOfHour;
    private Teacher teacher;

    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "discipline_name", length = 25, nullable = false)
    public String getDisciplineName() {
        return disciplineName;
    }

    public void setDisciplineName(String disciplineName) {this.disciplineName = disciplineName;
    }

    @Column(name = "cost_of hour")
    public BigDecimal getCostOfHour() {
        return costOfHour;
    }

    public void setCostOfHour(BigDecimal costOfHour) {
        this.costOfHour = costOfHour;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id", nullable = false)
    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
//