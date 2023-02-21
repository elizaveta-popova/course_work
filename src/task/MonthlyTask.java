package task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthlyTask extends Task {

    public MonthlyTask(String title, Type type, int id, LocalDateTime dateTime, String description) {
        super(title, type, id, dateTime, description);
    }

    public boolean appearsIn(LocalDate localDate) {
        return localDate.isAfter(getDateTime().toLocalDate())
                || localDate.isEqual(getDateTime().toLocalDate())
                && localDate.getDayOfMonth() == getDateTime().getDayOfMonth();
    }

//    public TaskType getTaskType() {
//        return TaskType.MONTHLY;
//    }
}
