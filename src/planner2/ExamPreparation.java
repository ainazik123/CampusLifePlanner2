package planner2;

public class ExamPreparation extends PlanItem {
    private String subject;

    public ExamPreparation(String title, String subject, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
        this.subject = subject;
    }

    @Override
    public boolean isUrgent() {
        return daysUntil <= 5 && !completed;
    }

    @Override
    public String toString() {
        return "ExamPreparation{title='" + title +
                "', subject='" + subject +
                "', examIn=" + daysUntil +
                ", estHours=" + estimatedHours +
                ", completed=" + completed + "}";
    }
}
