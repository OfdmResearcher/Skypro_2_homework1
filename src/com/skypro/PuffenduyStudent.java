package com.skypro;

public class PuffenduyStudent extends HogwartsStudent {

    private final int industriousness;
    private final int loyalty;
    private final int honesty;

    public PuffenduyStudent(String name, String surname, int powerOfMagic, int distance, int industriousness, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, distance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", industriousness=" + industriousness +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }

    public void comparePuffenduyStudents (PuffenduyStudent puffenduyStudent) {
        if (this.honesty + this.industriousness + this.loyalty > puffenduyStudent.honesty + puffenduyStudent.industriousness + puffenduyStudent.loyalty) {
            System.out.println("Student " + this + " is better, than student " + puffenduyStudent);
        } else if (this.honesty + this.industriousness + this.loyalty < puffenduyStudent.honesty + puffenduyStudent.industriousness + puffenduyStudent.loyalty) {
            System.out.println("Student " + puffenduyStudent + " is better, than student " + this);
        } else {
            System.out.println("Students are equal");
        }
    }

    public void print() {
        System.out.println(this);
    }
}
