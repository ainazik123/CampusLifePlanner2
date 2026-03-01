package planner2;

public class ClubEvent extends PlanItem {
    private String location;

    public ClubEvent(String title, String location, int daysUntil, int estimatedHours) {
        super(title, daysUntil, estimatedHours);
        this.location = location;
    }

    @Override
    public boolean isUrgent() {
        return daysUntil <= 1 && !completed;
    }

    @Override
    public String toString() {
        return "ClubEvent{title='" + title +
                "', location='" + location +
                "', happeningIn=" + daysUntil +
                ", estHours=" + estimatedHours +
                ", completed=" + completed + "}";
    }
}
