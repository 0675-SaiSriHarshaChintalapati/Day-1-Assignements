class Student{
  int studentId;
  String name;
  int age;
  String grade;
  Student(int studentId,String name,int age,String grade){
      this.studentId=studentId;
      this.name=name;
      this.age=age;
      this.grade=grade;
  }
  void display(){
      System.out.println("The StudentId is "+studentId);
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
      System.out.println("Grade: "+grade);
  }
}
public class Main {
    public static void main(String[] args) {
    Student s=new Student(14,"Harsha",21,"A+");
    Student v=new Student(16,"Har",26,"B+");
    s.display();
    v.display();
    }
}