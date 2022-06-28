import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class App2{

    public static void main(String[] args)throws Exception{

        DVD myDVD1 = new DVD("MAN OF STEEL", "2013", "Pg-13", "Zack Snyder", "Warner Brothers", "superhero movie");
        DVD myDVD2 = new DVD("CAPTAIN AMERICA THE FIRST AVENGER", "2011", "PG-13", "Joe Johnston", "Marvel Studios", "Captain America 1st");
        DVD myDVD3 = new DVD("RAGNAROK", "2017", "PG-18", "Taika Waititi", "Disney", "Thor 3rd");
        DVD myDVD4 = new DVD("LIGHTYEAR", "2022", "PG", "Angus MacLane", "PIXAR", "Buzz Lightyear story");
        DVDView view = new DVDView();
        DVD.DVDCollection.add(myDVD1);
        DVD.DVDCollection.add(myDVD2);
        DVD.DVDCollection.add(myDVD3);
        DVD.DVDCollection.add(myDVD4);
        DVDController controller = new DVDController();
        controller.run();


        PrintWriter out = new PrintWriter(new FileWriter("DVDCollection.txt"));
        for(int i = 0; i < DVD.DVDCollection.size(); i++){
            String  temp3 = DVD.DVDCollection.get(i).toString();
            out.println(temp3);
            out.flush();
            }
        }


    }
