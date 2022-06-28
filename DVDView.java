import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVDView {

    public List<DVD> DVDCollection = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    int menuSelection = 0;
    int editSelection = 0;
    int editMenuSelection =0 ;
    public int printMenuAndGetSelection() {
        System.out.println("Main Menu");
        System.out.println("1. Add a DVD");
        System.out.println("2. Delete a DVD");
        System.out.println("3. Change the studio of a movie");
        System.out.println("4. Search for a movie");
        System.out.println("5. List all the movies ");
        System.out.println("6. to exit");
        System.out.println("Please select from the above menu");
        return menuSelection = scan.nextInt();
    }
    public void editMenu(){
        System.out.println("1. Edit the studio of the film");
        System.out.println("2. Edit the release year of the film");
        System.out.println("3. Edit director's name ");
    }

    public void displayExitMessage(){
        System.out.println( "Good Bye!!!");
    }
    public void displayUnknownCommandBanner(){
        System.out.println("Unknown Command!!!");
    }
    public void getNewDVD(){
        Scanner scan = new Scanner(System.in);
        DVD newDVD = new DVD();
        System.out.println("Please pass title of movie ");
        String temp = scan.nextLine();
        temp = temp.toUpperCase();
        newDVD.setTitle(temp);
        System.out.println("Please pass release year of movie ");
        temp = scan.nextLine();
        newDVD.setReleaseDate(temp);
        System.out.println("Please pass MPAA rating of movie ");
        temp = scan.nextLine();
        newDVD.setMPAARating(temp);
        System.out.println("Please pass Director's name of movie ");
        temp = scan.nextLine();
        newDVD.setDirectorsName(temp);
        System.out.println("Please pass studio name of movie ");
        temp = scan.nextLine();
        newDVD.setStudio(temp);
        System.out.println("Please pass comments  of movie ");
        temp = scan.nextLine();
        newDVD.setUserRatingOrNote(temp);
        DVD.DVDCollection.add(newDVD);

    }
    public void removeDVD(){
        System.out.println("Which movie? ");
        String temp = scan.nextLine();
        temp = temp.toUpperCase();
        for (int i = 0; i < DVD.DVDCollection.size(); i++) {
            String name = DVD.DVDCollection.get(i).getTitle();
            if (name.compareTo(temp) == 0) {
                DVD.DVDCollection.remove(DVD.DVDCollection.get(i));
            }
        }
    }
    public void editStudioDVD(){
        System.out.println("Enter the title of the movie ");
        String temp = scan.nextLine();
        temp = temp.toUpperCase();
        for (int i = 0; i < DVD.DVDCollection.size(); i++) {
            String name = DVD.DVDCollection.get(i).getTitle();
            if (name.compareTo(temp) == 0) {
                System.out.println("Please pass your studio? ");
                String temp2 = scan.nextLine();
                DVD.DVDCollection.get(i).setStudio(temp2);
            }
        }
    }

    public void editRealeaseYear(){
        System.out.println("Enter the title of the movie ");
        String temp = scan.nextLine();
        temp = temp.toUpperCase();
        for (int i = 0; i < DVD.DVDCollection.size(); i++) {
            String name = DVD.DVDCollection.get(i).getTitle();
            if (name.compareTo(temp) == 0) {
                System.out.println("Please the release year ");
                String temp2 = scan.nextLine();
                DVD.DVDCollection.get(i).setReleaseDate(temp2);
            }
        }
    }
    public void editDirectorsName(){
        System.out.println("Enter the title of the movie ");
        String temp = scan.nextLine();
        temp = temp.toUpperCase();
        for (int i = 0; i < DVD.DVDCollection.size(); i++) {
            String name = DVD.DVDCollection.get(i).getTitle();
            if (name.compareTo(temp) == 0) {
                System.out.println("Please enter director's name ");
                String temp2 = scan.nextLine();
                DVD.DVDCollection.get(i).setDirectorsName(temp2);
            }
        }
    }
    public void searchForMovie(){
        System.out.println("Which movie ");
        String temp = scan.nextLine();
        temp = temp.toUpperCase();
        for (int i = 0; i < DVD.DVDCollection.size(); i++) {
            String name = DVD.DVDCollection.get(i).getTitle();
            if (name.compareTo(temp) == 0) {
                System.out.println(DVD.DVDCollection.get(i).toString());
            }
        }
    }
    public void listAllTheMovies(){
        for (int i = 0; i < DVD.DVDCollection.size(); i++) {
            System.out.println(DVD.DVDCollection.get(i).toString());

        }
    }





}
