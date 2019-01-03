package models;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Exercise {
    //Might want to use string, name will not change
    private SimpleStringProperty name;
    private ObservableList<ExerciseSet> sets;
    private Date datePreformed;

    public Exercise(String name){
        this.name = new SimpleStringProperty(name);
        datePreformed = new Date();
        sets = FXCollections.observableArrayList(new ArrayList<ExerciseSet>());
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public ObservableList<ExerciseSet> getSets() {
        return sets;
    }

    public void setSets(ObservableList<ExerciseSet> sets) {
        this.sets = sets;
    }

    public Date getDatePreformed() {
        return datePreformed;
    }

    public void setDatePreformed(Date datePreformed) {
        this.datePreformed = datePreformed;
    }
}
