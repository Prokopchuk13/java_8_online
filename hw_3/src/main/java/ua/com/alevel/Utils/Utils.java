package ua.com.alevel.Utils;
import java.util.UUID;

public class Utils {

    public static String generateId(){
        return UUID.randomUUID().toString();
    }
}