class Student
{  
    float marks, attendance;  
    String name, roll_no;  
    Student()
    {
        marks = 0;
        attendance = 0;
        name = " ";
        roll_no = " ";
    }
    public float getMarks() 
    {  
        return marks;  
    }  
    public void setMarks(float marks)
    {  
        if(marks < 0)
        {
            marks = 0;
        }
        if(marks > 100)
        {
            marks = 100;
        }
        this.marks = marks;  
    }  

    public float getAttendance() 
    {  
        return attendance;  
    }  
    public void setAttendance(float attendance) 
    {  
        this.attendance = attendance;  
    } 

    public String getName() 
    {  
        return name;  
    }  
    public void setName(String name) 
    {  
        this.name = name;  
    }  

    public String getRollNo() 
    {  
        return roll_no;  
    }  
    public void setRollNo(String roll_no) 
    {  
        this.roll_no = roll_no;  
    }
}  


class Main{  
    public static void main(String args[]) {  
        float temp;
        Student Student1 = new Student();  
        Student1.setName("Rahul");  
        Student1.setRollNo("20ME20003");  
        Student1.setMarks(60);  
        Student1.setAttendance(66);  
        temp = Student1.getAttendance();
        if(temp >= 75)
        {
            float marks = Student1.getMarks();
            marks += marks/10;
            Student1.setMarks(marks);
        }
          
        System.out.println(Student1.name + " " + Student1.roll_no +  " " + Student1.marks + " " + Student1.attendance );

        Student Student2 = new Student();  
        Student2.setName("Sweta");  
        Student2.setRollNo("20CH10006");  
        Student2.setMarks(50);  
        Student2.setAttendance(91);  
        temp = Student2.getAttendance();
        if(temp >= 75)
        {
            float marks = Student2.getMarks();
            marks += marks/10;
            Student2.setMarks(marks);
        }
          
        System.out.println(Student2.name + " " + Student2.roll_no +  " " + Student2.marks + " " + Student2.attendance);

    }  

}  
