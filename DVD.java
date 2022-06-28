import java.util.ArrayList;
import java.util.List;

public class DVD {

    private String title;
    private String releaseDate;
    private String MPAARating;
    private String directorsName;
    private String studio;
    private String userRatingOrNote;

    static List<DVD> DVDCollection = new ArrayList<>();

    public DVD(){

    }
    public DVD(String title, String releaseDate, String MPAARating, String directorsName, String studio, String userRatingOrNote){
        this.title = title;
        this.releaseDate = releaseDate;
        this.MPAARating = MPAARating;
        this.directorsName = directorsName;
        this.studio = studio;
        this.userRatingOrNote = userRatingOrNote;
    }

    //// GETTERS AND SETTERS /////


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMPAARating() {
        return MPAARating;
    }

    public void setMPAARating(String MPAARating) {
        this.MPAARating = MPAARating;
    }

    public String getDirectorsName() {
        return directorsName;
    }

    public void setDirectorsName(String directorsName) {
        this.directorsName = directorsName;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getUserRatingOrNote() {
        return userRatingOrNote;
    }

    public void setUserRatingOrNote(String userRatingOrNote) {
        this.userRatingOrNote = userRatingOrNote;
    }

    public String toString(){
        return title + ", " + releaseDate + ", " + directorsName + ", " + MPAARating + ", " + studio + ", " + userRatingOrNote;
    }
}
