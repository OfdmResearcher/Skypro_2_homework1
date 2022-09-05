package com.skypro;

public abstract class HogwartsStudent {

    private String name;
    private String surname;
    private int powerOfMagic;
    private int distance;

    public HogwartsStudent(String name, String surname, int powerOfMagic, int distance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void compareStudents(HogwartsStudent hogwartsStudent) {
        if (this.powerOfMagic + this.distance > hogwartsStudent.powerOfMagic + hogwartsStudent.distance) {
            System.out.println("Student " + this + " is better, than student " + hogwartsStudent);
        } else if (this.powerOfMagic + this.distance < hogwartsStudent.powerOfMagic + hogwartsStudent.distance) {
            System.out.println("Student " + hogwartsStudent + " is better, than student " + this);
        } else {
            System.out.println("Students are equal");
        }
    }

    @Override
    public String toString() {
        return name + " " + surname +
                ", powerOfMagic=" + powerOfMagic +
                ", distance=" + distance;
    }

    public void print() {
        System.out.println(this);
    }
}
