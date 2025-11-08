package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter the file name (e.g., students.txt): ");
        String fileName = sc.nextLine().trim();


        System.out.print("How many students do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine();

        int i = 0;
        while (i < count) {
            // TODO: prompt for name, email, course using sc.nextLine()
            System.out.print("Please enter the name of the student: ");
            String name = sc.nextLine();
            System.out.print("Please enter the email of the student: ");
            String email = sc.nextLine();
            System.out.print("Please enter the course of the student: ");
            String course = sc.nextLine();

            // TODO: create a Student using one of your constructors
            Student student = new Student(name, email, course);

            // TODO: add the new Student to students
            students.add(student);
            i++;
        }

        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            for (Student s : students) {
                out.println("Name='" + s.name + "', Email='" + s.email + "', Course='" + s.course + "'");
            }
            System.out.println("Saved to " + fileName);
        } catch (IOException ex) {
            System.out.println("Could not write to file: " + ex.getMessage());
        }

    }
}
