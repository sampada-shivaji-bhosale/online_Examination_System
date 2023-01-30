package online_examination;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam_class {
    Scanner sc=new Scanner(System.in);
    private double mrk;
    private int sub;
    Student obj3 = new Student();
    public void logic() {
        Questions q1 = new Questions("which statement is true about java", "A.java is low level language", "B.java is high level laguage", "C.java used only rare companies", "D.java used graphic desining");
        Questions q2 = new Questions("Number of primitive data types in java", "A.6", "B.7", "C.8", "D.9");
        Questions q3 = new Questions("what is size of float and double in java", "A.32 and 64", "B.32 and 32", "C.64 and 64", "D.64 and 32");
        Questions q4 = new Questions("garbag collection perform by developer in java", "A.true", "B.false", "C.both of above", "D.non of the above");
        Questions q5 = new Questions("when object created with new keyword", "A.run time", "B.compiler time", "C.depends on the code", "D.none");
        Map<Questions, Character> hmap = new HashMap<>();
        hmap.put(q1, 'B');
        hmap.put(q2, 'C');
        hmap.put(q3, 'A');
        hmap.put(q4, 'B');
        hmap.put(q5, 'A');
        for (Map.Entry<Questions, Character> map : hmap.entrySet()) {
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.println("Enter your answer :");
            Character ans = sc.next().charAt(0);
            int chans = Character.compare(ans, map.getValue());
            if (chans == 0) {

                mrk = mrk + 2;
            }
        }
        obj3.setMarks(mrk);
        System.out.println("DO you want to submit test\n 1. yes  2.No");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("Test Submitted Sucessfully !!");
            System.out.println("View result :1.want 2. Not yet");
            int mark = sc.nextInt();
            if (mark == 1) {
                System.out.println(obj3.getMarks());
            } else {
                System.out.println("Thank you !");
            }
        }
    }

       /* public void result_mrk() {
            System.out.println("Do you wants to submit \n 1.yes 2.No");
            sub = sc.nextInt();
            if (sub == 1) {
                System.out.println(obj3.getMarks());
            }
            else{
                System.out.println("Please contact us");
            }
        }*/


}

