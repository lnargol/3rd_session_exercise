package MFTS;

import java.util.ArrayList;

public class Test
{

    public static void main(String[] args)
    {
        Course fizik = new Course() ;
        fizik.courseName = "fizik" ;
        fizik.courseCode = "01" ;

        Course riazi = new Course() ;
        riazi.courseName = "riazi" ;
        riazi.courseCode = "02" ;

        Student st1 = new Student() ;
        st1.name = "ali" ;
        st1.family = "gholami" ;
        st1.courseArray.add(fizik) ;
        st1.courseArray.add(riazi) ;
        st1.courseMap.put(fizik , 19) ;
        st1.courseMap.put(riazi , 16) ;



        Student st2 = new Student() ;
        st2.name  = "akbar" ;
        st2.family = "moghimi" ;
        st2.courseArray.add(fizik) ;
        st2.courseArray.add(riazi) ;
        st2.courseMap.put(fizik , 20) ;
        st2.courseMap.put(riazi , 15) ;


        ArrayList<Student> studentsResults = new ArrayList<>() ;
        studentsResults.add(st1) ;
        studentsResults.add(st2) ;




        for (Student sample : studentsResults)
        {
            System.out.println(sample.name);
            System.out.println(sample.family);
            System.out.println(sample.courseArray.get(0).courseName);
            System.out.println(sample.courseArray.get(0).courseCode);
            System.out.println(sample.courseMap.get(sample.courseArray.get(0)));

            System.out.println(sample.courseArray.get(1).courseName);
            System.out.println(sample.courseArray.get(1).courseCode);
            System.out.println(sample.courseMap.get(sample.courseArray.get(1)));




        }



    }
}
