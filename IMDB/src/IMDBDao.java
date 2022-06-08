import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class IMDBDao {


    List<String> movies = new ArrayList();
    public IMDBDao(String path){

        File imdb = new File(path);
        try {
            movies = Files.readAllLines(imdb.toPath());
        }
        catch (Exception e){


            System.out.println(e);
        }


    }

    public static void main(String[] args) {
        IMDBDao s = new IMDBDao("C:\\Users\\Dell\\Downloads\\imdb\\IMDB\\src\\imdb.csv");
        for(int i = 0; i<s.movies.size(); i++){

            String[] a = s.movies.get(i).split(",");
            IMDB sp = new IMDB(a[1],a[2],a[3]);
            System.out.println(sp.getTitle()+","+sp.getYear()+","+sp.getRuntime());


        }
    }
}


