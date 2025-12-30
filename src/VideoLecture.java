public class VideoLecture extends ContentItem implements Downloadable{
    private String quality;

    public VideoLecture(String title, int year, int durationMinutes, String quality) {
        super(title, year, durationMinutes);
        setQuality(quality);
    }

    public void setQuality(String quality) {
        this.quality=quality;
    }
    public String getQuality() {
        return quality;
    }

    public double getLicenseCost(int currentYear) {
        int ageFactor = getAge(currentYear);
        if (ageFactor <=2)
            ageFactor=5;
        else ageFactor=2;
        return 0.05*getDurationMinutes()+ageFactor;
    }

    @Override
    public String toString(){
        return "Video Lecture: "+super.toString()+", quality: "+quality;
    }

    public void download() {
        System.out.println("Downloading podcast hosted by <"+quality+">...");
    }

    public int getMaxDownloadsPerDay() {
        return 3;
    }
}
