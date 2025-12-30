public abstract class ContentItem {
    private int id;
    private static int idGen;
    private String title;
    private int year;
    private int durationMinutes;

    public ContentItem(String title, int year, int durationMinutes){
        this.id = idGen++;
        setTitle(title);
        setYear(year);
        setDurationMinutes(durationMinutes);
    }

    public void setTitle(String title){
        if (!(title == null || title.isBlank()))
            this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setYear(int year){
        if (year>=1990 && year<=2025)
            this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setDurationMinutes(int durationMinutes){
        if (durationMinutes>0)
            this.durationMinutes = durationMinutes;
    }
    public int getDurationMinutes(){
        return durationMinutes;
    }

    public int getAge (int currentYear){
        return currentYear-year;
    }

    public abstract double getLicenseCost(int currentYear);

    public String toString(){
        return "id: "+id+", title: "+title+", year: "+year+", duration: "+durationMinutes;
    }
}
