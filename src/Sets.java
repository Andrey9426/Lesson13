import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> names = new LinkedHashSet<>();
        names.add("Nick");
        names.add("Ivan");
        names.add("Vasiy");
        names.add("Nick");
        for(String name: names){
            System.out.println(name);
        }
    }
}
