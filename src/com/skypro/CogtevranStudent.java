package com.skypro;

public class CogtevranStudent extends HogwartsStudent {

    private final int intelligence;
    private final int wisdom;
    private final int wittiness;
    private final int creativity;

    public CogtevranStudent(String name, String surname, int powerOfMagic, int distance, int intelligence, int wisdom, int wittiness, int creativity) {
        super(name, surname, powerOfMagic, distance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", intelligence=" + intelligence +
                ", wisdom=" + wisdom +
                ", wittiness=" + wittiness +
                ", creativity=" + creativity;
    }

    public void compareCogtevranStudents (CogtevranStudent cogtevranStudent) {
        if (this.creativity + this.intelligence + this.wisdom + this.wittiness > cogtevranStudent.creativity + cogtevranStudent.intelligence + cogtevranStudent.wisdom + cogtevranStudent.wittiness) {
            System.out.println("Student " + this + " is better, than student " + cogtevranStudent);
        } else if (this.creativity + this.intelligence + this.wisdom + this.wittiness < cogtevranStudent.creativity + cogtevranStudent.intelligence + cogtevranStudent.wisdom + cogtevranStudent.wittiness) {
            System.out.println("Student " + cogtevranStudent + " is better, than student " + this);
        } else {
            System.out.println("Students are equal");
        }
    }

    public void print() {
        System.out.println(this);
    }
}
