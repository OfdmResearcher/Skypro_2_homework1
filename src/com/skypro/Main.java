package com.skypro;

public class Main {

    public static void main(String[] args) {

        GryffindorStudent student1 = new GryffindorStudent("Harry", "Potter", 23, 12,24,26,78);
        GryffindorStudent student2 = new GryffindorStudent("Germiona", "Granger", 20, 16, 34, 9, 54);
        GryffindorStudent student3 = new GryffindorStudent("Bob", "Dawson", 2, 3, 4, 5, 6);
        GryffindorStudent student4 = new GryffindorStudent("Rob", "Crawson", 1, 2, 3, 4, 5);
        PuffenduyStudent student5 = new PuffenduyStudent("Elena", "Drake", 43, 21, 23, 5, 1);
        PuffenduyStudent student6 = new PuffenduyStudent("Zaharia", "Smith", 12, 30, 4, 50, 3);

        student5.comparePuffenduyStudents(student6);
        student5.compareStudents(student1);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        student1.compareStudents(student2);


        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);
        student3.compareGryffindorStudents(student4);

    }
}
