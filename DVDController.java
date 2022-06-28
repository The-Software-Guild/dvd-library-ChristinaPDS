import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVDController {

    Scanner scan = new Scanner(System.in);
    public DVDView view = new DVDView();

    public void unkownMessage(){
        view.displayUnknownCommandBanner();
    }
    public void exitMessage(){
        view.displayExitMessage();
    }
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while(keepGoing){

            System.out.println("Main Menu");
            System.out.println("1. Add a DVD");
            System.out.println("2. Delete a DVD");
            System.out.println("3. Edit the studio of the movie");
            System.out.println("4. Search for a movie");
            System.out.println("5. List all the movies ");
            System.out.println("6. to exit");
            System.out.println("Please select from the above choices ");
            menuSelection = scan.nextInt();



            switch (menuSelection){
                case 1:
                    System.out.println("ADD A DVD ");
                    view.getNewDVD();
                    break;
                case 2:
                    System.out.println("DELETE A DVD ");
                    view.removeDVD();
                    break;
                case 3:
                    System.out.println("Edit a movie ");
                    view.editMenu();
                    int editSelection = scan.nextInt();
                    switch (editSelection){
                        case 1:
                            view.editStudioDVD();
                            break;
                        case 2:
                            view.editRealeaseYear();
                            break;
                        case 3:
                            view.editDirectorsName();
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Search for a movie");
                    view.searchForMovie();
                    break;
                case 5:
                    System.out.println("List all the movies");
                    view.listAllTheMovies();
                    break;
                case 6:
                    keepGoing = false;

                    break;
                default:
                    unkownMessage();


            }

        }
    exitMessage();

    }
}
