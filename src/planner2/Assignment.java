package planner2;

public class Assignment extends PlanItem {
    private Course course;

    public Assignment(String title, Course course, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
        this.course = course;
    }

    @Override
    public boolean isUrgent() {
        return daysUntil <= 2 && !completed;
    }

    @Override
    public String toString() {
        return "Assignment{title='" + title +
                "', course='" + course.getName() +
                "', dueIn=" + daysUntil +
                ", estHours=" + estimatedHours +
                ", completed=" + completed + "}";
    }
}
