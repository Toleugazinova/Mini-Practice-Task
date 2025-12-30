import java.util.ArrayList;
import java.util.Scanner;
public class ContentDemo {
    private ArrayList<ContentItem> items = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    public void main(String[] args) {
        items.add(new VideoLecture("First lecture", 2020, 20, "HD"));
        items.add(new VideoLecture("Second lecture", 2021, 35, "4K"));
        items.add(new PodcastEpisode("First episode", 2022, 40, "Jane"));
        items.add(new PodcastEpisode("Second episode", 2022, 40, "Will"));

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        for (ContentItem item : items) {
            System.out.print(item.toString() + " | licenseCost=" + item.getLicenseCost(currentYear));
            if (item instanceof Downloadable){
                Downloadable downloadable = (Downloadable) item;
                downloadable.download();
                System.out.println("Max downloads/day: "+ downloadable.getMaxDownloadsPerDay());
            }
        }
    }
}
