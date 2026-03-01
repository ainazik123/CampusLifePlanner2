package planner2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Course oop = new Course("OOP", "Dr. Lee", 6);
        Course math = new Course("Discrete Math", "Dr. Kim", 5);


        ArrayList<PlanItem> items = new ArrayList<>();

        items.add(new Assignment("Lab 3", oop, 1, 3));
        items.add(new Assignment("Project", oop, 5, 8));
        items.add(new ExamPreparation("Midterm Review", "Discrete Math", 4, 6));
        items.add(new ClubEvent("Robotics Club Meeting", "Campus Hall", 1, 2));
        items.add(new ExamPreparation("Final Prep", "OOP", 10, 12));

        System.out.println("=== ALL PLAN ITEMS ===");

        for (PlanItem item : items) {
            if (item.isUrgent()) {
                System.out.println("URGENT -> " + item);
            } else {
                System.out.println(item);
            }
        }
        int totalRemaining = 0;
        for (PlanItem item : items) {
            if (!item.isCompleted()) {
                totalRemaining += item.getEstimatedHours();
            }
        }

        System.out.println("\nTotal remaining hours: " + totalRemaining);


        PlanItem mostUrgent = null;

        for (PlanItem item : items) {
            if (!item.isCompleted()) {
                if (mostUrgent == null || item.getDaysUntil() < mostUrgent.getDaysUntil()) {
                    mostUrgent = item;
                }
            }
        }

        if (mostUrgent != null) {
            System.out.println("Most urgent activity: " + mostUrgent.getSummary());
        }

        System.out.println("\n=== MARKING ONE ITEM COMPLETED ===");
        items.get(0).markCompleted();

        System.out.println("Updated item:");
        System.out.println(items.get(0));
        totalRemaining = 0;
        for (PlanItem item : items) {
            if (!item.isCompleted()) {
                totalRemaining += item.getEstimatedHours();
            }
        }

        System.out.println("New remaining hours: " + totalRemaining);
    }
}
