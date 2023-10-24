package oop_homework3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("William ", "Jones", "Sanchez", 1, 3);
        Student student2 = new Student("Derek ", "Johnson", "Brown", 2, 5);
        Student student3 = new Student("Michael ", "Jennings", "Martin", 3, 1);
        Student student4 = new Student("Thomas ", "Soto", "Little", 4, 3);
        Student student5 = new Student("John ", "Davis", "Webb", 5, 1);
        Student student6 = new Student("Brian ", "Fields", "Knight", 6, 4);
        Student student7 = new Student("Alen ", "Terry", "Ramirez", 7, 5);
        Student student8 = new Student("Caroline  ", "Fuller", "Wilson", 8, 3);
        Student student9 = new Student("Norma  ", "Massey", "Gomez", 9, 2);
        Student student10 = new Student("Rebecca  ", "Carr", "Bryant", 10, 4);
        Student student11 = new Student("Tonya  ", "Morrison", "Brooks", 11, 2);
        Student student12 = new Student("Laura  ", "Franklin", "Russell", 12, 4);
        Student student13 = new Student("Marjorie  ", "Campbell", "Sutton", 13, 4);
        Student student14 = new Student("Gail  ", "Harris", "Diaz", 14, 2);
        Student student15 = new Student("Mary  ", "Williams", "Wright", 15, 5);

        StudentGroup group1 = new StudentGroup("Group A");
        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);


        StudentGroup group2 = new StudentGroup("Group B");
        group2.addStudent(student4);
        group2.addStudent(student5);
        group2.addStudent(student6);
        group2.addStudent(student7);


        StudentGroup group3 = new StudentGroup("Group C");
        group3.addStudent(student8);
        group3.addStudent(student9);


        StudentGroup group4 = new StudentGroup("Group D");
        group4.addStudent(student10);
        group4.addStudent(student11);
        group4.addStudent(student12);
        group4.addStudent(student13);
        group4.addStudent(student14);
        group4.addStudent(student15);
        StudentGroup group5 = new StudentGroup("Group E");
        group5.addStudent(student14);
        group5.addStudent(student15);

        




        Stream stream1 = new Stream("Stream 1", List.of(group1, group2,group5));
        Stream stream2 = new Stream("Stream 2", List.of(group3,group4));


        StudentGroupController controller = new StudentGroupController();

        List<Stream> streamsToSort = new ArrayList<>();   // список потоков
        streamsToSort.add(stream1);
        streamsToSort.add(stream2);

        System.out.println("until sort:");
        controller.printStreams(streamsToSort);

        controller.sortStreams(streamsToSort); // Сортируем потоки

        System.out.println();
        System.out.println("after sort:");
        controller.printStreams(streamsToSort);
    }
}





