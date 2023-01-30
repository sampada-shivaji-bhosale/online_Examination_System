package online_examination;

import java.util.Scanner;

public class Client_Conn {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Student_detail insert =new Student_detail();
        String id;
        String pass;
        String setNo;
        int choice;
        System.out.println("Welcome To Examination");
        do{
            System.out.println(" 1.Login\n 2.Create account\n 3.Logout");
            choice=input.nextInt();
            Exam_class ob=new Exam_class();
            switch(choice){
                case 1:
                    System.out.println("Enter set number");
                    setNo=input.next();
                    Student st1=new Student(setNo);
                    boolean authonticate=insert.login(st1);
                    if(authonticate==true){
                        System.out.println("You are Authonticated !!\nGO to Exam");
                        System.out.println("DO you want to star exam\n 1.yes 2.No");
                        choice=input.nextInt();
                        if(choice==1){
                        //Exam_class ob=new Exam_class();
                        ob.logic();}
                    }
                    else{
                        System.out.println("please enter correct set number\n or Create new Account");
                    }
                    break;
                case 2:
                    System.out.println("Enter ID ");
                    id=input.next();
                    System.out.println("Enter password");
                    pass=input.next();
                    System.out.println("Enter Exam Set number :");
                    setNo=input.next();
                    Student st=new Student(id,pass,setNo);
                    boolean inset=insert.account(st);
                    if(inset==true){
                        System.out.println("Your Account Created \nYou can login to exam");
                    }
                    else{
                        System.out.println("Please Try again");
                    }
                    break;
                case 3:
                    System.out.println("Are you sure want's to finish\n1.yes\t2.No");
                    choice=input.nextInt();
                    if(choice==1){
                        System.out.println(" Thank you !!");
                        System.exit(0);
                        break;
                    }
                default:
                    System.out.println("Please Enter the valid Choice");

            }

        }while(choice<4);


    }
}
