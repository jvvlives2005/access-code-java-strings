package nyc;

/**
 * Created by c4q-joshelynvivas on 3/3/15.
 */
public class Christmas {
    public static void main(String[] args) {
        String begin= "On the ";
        String end= "day of Christmas my true love sent to me, ";
        String tree= "a Patridge in a Pear Tree. ";
        String doves= "Turtle Doves ";
        String hens= "French Hens ";
        String birds= "Calling Birds ";
        String rings= "Gold Rings ";
        String geese= "Geese a-Laying ";
        String swans= "Swans a-Swimming ";
        String maids= "Maids a-Milking ";
        String ladies= "Ladies Dancing ";
        String lords= "Lords a-Leaping ";
        String pipers= "Pipers Piping ";
        String drummers= "Drummers Drumming ";
        int countdown;
        for (countdown=1; countdown <=12; countdown++){
            System.out.println( begin + countdown + "st " + end );
        }


    }
}
