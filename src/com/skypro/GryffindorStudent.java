package com.skypro;

public class GryffindorStudent extends HogwartsStudent {

    private final int nobility;
    private final int honor;
    private final int bravery;

    public GryffindorStudent(String name, String surname, int powerOfMagic, int distance, int nobility, int honor, int bravery) {
        super(name, surname,powerOfMagic, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }

    public void compareGryffindorStudents (GryffindorStudent gryffindorStudent) {
        if (this.bravery + this.honor + this.nobility > gryffindorStudent.bravery + gryffindorStudent.honor + gryffindorStudent.nobility) {
            System.out.println("Student " + this + " is better, than student " + gryffindorStudent);
        } else if (this.bravery + this.honor + this.nobility < gryffindorStudent.bravery + gryffindorStudent.honor + gryffindorStudent.nobility) {
            System.out.println("Student " + gryffindorStudent + " is better, than student " + this);
        } else {
            System.out.println("Students are equal");
        }
    }

    public void print() {
        System.out.println(this);
    }
}
