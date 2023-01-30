package online_examination;

public class Student {
    private String email;
    private String password;
    private String setno;
    public static double marks;

    public Student(){}

    public Student(String setNo){
        this.setno=setNo;
    }
    public Student(String email_id,String pass,String setno){
        this.email=email_id;
        this.password=pass;
        this.setno=setno;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getsetno(){
        return setno;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}
