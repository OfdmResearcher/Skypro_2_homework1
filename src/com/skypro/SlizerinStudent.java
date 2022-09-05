package com.skypro;

public class SlizerinStudent extends HogwartsStudent {

    private final int trickery;
    private final int commitment;
    private final int ambition;
    private final int resourcefulness;
    private final int desireForPower;

    public SlizerinStudent(String name, String surname, int powerOfMagic, int distance, int trickery, int commitment, int ambition, int resourcefulness, int desireForPower) {
        super(name, surname, powerOfMagic, distance);
        this.trickery = trickery;
        this.commitment = commitment;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.desireForPower = desireForPower;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trickery=" + trickery +
                ", commitment=" + commitment +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", desireForPower=" + desireForPower;
    }

    public void compareSlizerinStudents (SlizerinStudent slizerinStudent) {
        if (this.ambition + this.commitment + this.desireForPower + this.resourcefulness + this.trickery > slizerinStudent.commitment + slizerinStudent.ambition + slizerinStudent.desireForPower + slizerinStudent.resourcefulness + slizerinStudent.trickery) {
            System.out.println("Student " + this + " is better, than student " + slizerinStudent);
        } else if (this.ambition + this.commitment + this.desireForPower + this.resourcefulness + this.trickery < slizerinStudent.commitment + slizerinStudent.ambition + slizerinStudent.desireForPower + slizerinStudent.resourcefulness + slizerinStudent.trickery) {
            System.out.println("Student " + slizerinStudent + " is better, than student " + this);
        } else {
            System.out.println("Students are equal");
        }
    }

    public void print() {
        System.out.println(this);
    }
}

