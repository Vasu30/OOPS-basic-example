    abstract class University{  

    String name;
    double weight;
    int age;

     public String getName() {
        return name;
    }
     public double getWeight() {
        return weight;
    }
     public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    abstract void getdetails(String arg);
    // {
        
    // }  
    }  
    
    class Student extends University{ 



    void getdetails(String course_name)
    {

        System.out.println(" Course Name: " + course_name);
    }  
    }  

    class Faculty extends University{ 

    

    void getdetails(String sub_name)
    {
        System.out.println(" Subject Name: " + sub_name);
       
    }  
    }  

    public class exercise {
    public static void main(String[] args) {
        // University myDetail = new University();
        University studentDetail = new Student();
        University facultyDetail = new Faculty();
        // Student studentDetail = new Student();
        // Faculty facultyDetail = new Faculty();

        
        
        System.out.println("===Student Details===");
        
        studentDetail.setName("Krishil");
        studentDetail.setWeight(55.500);
        studentDetail.setAge(21);
        System.out.println("Name: " + studentDetail.getName());
        System.out.println(studentDetail.getName() + "weight is: " + studentDetail.getWeight() + "kg");
        System.out.println(studentDetail.getName() + "age is: " + studentDetail.getAge());
        studentDetail.getdetails("computer");

        System.out.println("===Faculty Details===");
        
        facultyDetail.setName("Harshit");
        facultyDetail.setWeight(75);
        facultyDetail.setAge(27);
        System.out.println("Name: " + facultyDetail.getName());
        System.out.println(facultyDetail.getName() + "weight is: " + facultyDetail.getWeight() + "kg");
        System.out.println(facultyDetail.getName() + "age is: " + facultyDetail.getAge());
        facultyDetail.getdetails("JAVA");
    }
}
    
    
