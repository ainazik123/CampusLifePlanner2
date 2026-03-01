package planner2;

public abstract class PlanItem {

protected String title;
protected int daysUntil;
protected int estimatedHours;
protected boolean completed;

public PlanItem(String title, int daysUntil, int estimatedHours) {
    this.title = title;
    this.daysUntil = daysUntil;
    this.estimatedHours = estimatedHours;
    this.completed = false;
}

public String getTitle() {
    return title;
}

public int getDaysUntil() {
    return daysUntil;
}

public int getEstimatedHours() {
    return estimatedHours;
}

public boolean isCompleted() {
    return completed;
}
public void markCompleted() {
    completed = true;
}


public boolean isUrgent() {
    return daysUntil <= 3 && !completed;
}

public String getSummary() {
    return title + " (due in " + daysUntil + " days)";
}

@Override
public abstract String toString();
}