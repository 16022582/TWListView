package rp.tw_listview;

public class Modules {
    private String name;
    private boolean day;

    public Modules(String name, boolean day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }
    public boolean isDay() {
        return day;
    }
}
