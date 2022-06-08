public class IMDB {

    String title;
    String year;
    String runtime;
    public  IMDB(String t,String y,String r){
        this.title = t;
        this.year = y;
        this.runtime = r;
    }
    String getRuntime(){

        return this.runtime;
    }
    String getTitle(){
        return this.title;
    }
    String getYear(){
        return this.year;
    }
}
