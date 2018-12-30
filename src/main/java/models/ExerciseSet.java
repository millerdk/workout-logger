package models;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class ExerciseSet {
    private SimpleIntegerProperty reps = new SimpleIntegerProperty(0);
    private SimpleDoubleProperty weight = new SimpleDoubleProperty(0.0);

    public ExerciseSet () {}

    public ExerciseSet(Integer reps, Double weight){
        this.setReps(reps);
        this.setWeight(weight);
    }

    public int getReps() {
        return reps.get();
    }

    public SimpleIntegerProperty repsProperty() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps.set(reps);
    }

    public double getWeight() {
        return weight.get();
    }

    public SimpleDoubleProperty weightProperty() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight.set(weight);
    }
}
