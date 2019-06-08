import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Map<Long, Student> studentMap = new TreeMap<>();

        Student student1 = new Student(123, "Adam", "RTWR");
        Student student2 = new Student(434, "ASDASD", "QWE");
        Student student3 = new Student(234, "ZXC", "ASD");
        Student student4 = new Student(546, "WEEW", "ZXC");
        Student student5 = new Student(676, "ZXC", "ASDAS");

        studentMap.put(student1.getNumerIndeksu(), student1);
        studentMap.put(student2.getNumerIndeksu(), student2);
        studentMap.put(student3.getNumerIndeksu(), student3);
        studentMap.put(student4.getNumerIndeksu(), student4);
        studentMap.put(student5.getNumerIndeksu(), student5);

        //Hashcode jest kluczem, czyli parametr podany np 123 musi posiadac rozszerzenie w mapie do tego samego typu
        System.out.println(studentMap.containsKey(123L));
        System.out.println(studentMap.get(123L));

        System.out.println(studentMap.size());

        System.out.println(studentMap.values());

    }

}
