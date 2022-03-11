import java.util.ArrayList;
import java.util.List;

public class StudentService {
    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<String> findNamesWithLetterE() {
        List<String> studentsWithLetterE = new ArrayList<>();
        for (String i : studentRepository.getStudentsFromDatabase()) {
            if (i.contains("e")) {
                studentsWithLetterE.add(i);
            }

        }
        return studentsWithLetterE;
    }
    public static void main(String[] args) {
        StudentRepository studentRepository = new StudentRepository();
        StudentService studentService = new StudentService(studentRepository);
        System.out.println(studentRepository.getStudentsFromDatabase());
        System.out.println(studentService.findNamesWithLetterE());
    }
}

