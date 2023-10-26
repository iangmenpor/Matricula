// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Alumnno
        Students students1 = new Students();
        students1.setDni("001M");
        students1.setName("Ian");
        students1.setLastname("Mendoza");

        System.out.println(students1.getDni());
        System.out.println(students1.getName());
        System.out.println(students1.getLastname());

        // Curso

        Course course1 = new Course();
        course1.setCode("001");
        course1.setName("2 Bach");

        System.out.println(course1.getName());
        System.out.println(course1.getCode())

        //Asignatura
        Subjects subjects1 = new Subjects();
        subjects1.setCode("002");
        subjects1.setName("Math");

        System.out.println(subjects1.getCode());
        System.out.println(subjects1.getName());

        //para relacionar, osea las flechitas


    }


}