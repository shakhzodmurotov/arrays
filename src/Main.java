import java.sql.Array;

public class Main {
    public static void main(String[] args)
    {
        int [] myarrays = new int[10];
        int value = 9;
        for(int i = 0; i < myarrays.length; i++){
            myarrays[i] = value;
            value--;
        }
        for (int x : myarrays){
            System.out.println(x);
        }
    }
}