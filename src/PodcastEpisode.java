public class PodcastEpisode extends ContentItem implements Downloadable{
    private String hostName;

    public PodcastEpisode(String title, int year, int durationMinutes, String hostName) {
        super(title, year, durationMinutes);
        setHostName(hostName);
    }

    public String getHostName(){
        return hostName;
    }
    public void setHostName(String hostName){
        this.hostName = hostName;
    }

    public double getLicenseCost(int currentYear) {
        int ageFactor = getAge(currentYear);
        if (ageFactor <=2)
            ageFactor=3;
        else ageFactor=1;
        return 0.03*getDurationMinutes()+ageFactor;
    }

    @Override
    public String toString(){
        return "Podcast episode: "+super.toString()+", host name: "+hostName;
    }

    public void download() {
        System.out.println("Downloading podcast hosted by <"+hostName+">...");
    }

    public int getMaxDownloadsPerDay() {
        return 10;
    }
}
