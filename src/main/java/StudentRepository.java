import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
   private String[] studentDatabase = {"jon", "david", "elon", "michelle", "esther"};


   public List<String> getStudentsFromDatabase() {
       ArrayList<String> studentsFromDb = new ArrayList<>();
       for (String i : studentDatabase) {
           studentsFromDb.add(i);
       }
      // return studentsFromDb;
       return null;
   }
}
