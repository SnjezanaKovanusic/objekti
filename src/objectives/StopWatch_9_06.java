package objectives;

public class StopWatch_9_06 {
    long startTime;
    long endTime;


    public StopWatch_9_06() {
        startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime() {
        startTime = System.currentTimeMillis();
    }

    public void setEndTime() {
        endTime = System.currentTimeMillis();
    }

    public long getElipsedTime() {
        return getStartTime() - getEndTime();

    }

    @Override
    public String toString() {
        return "StopWatch_9_06{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +

                '}';
    }
}
