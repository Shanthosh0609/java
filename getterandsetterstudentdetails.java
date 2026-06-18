class student
{
    private int rno;
    private String name;
    private double marks;
   
    student(int r, String n, double m)
    {
        rno = r;
        name = n;
        marks = m;
    }
   
    int getrno() { return rno; }
    void setrno(int r) { rno = r; }
    String getname() { return name; }
    void setname(String n) { name = n; }
    double getmarks() { return marks; }
    void setmarks(double m) { marks = m; }
   
    void display()
    {
        System.out.println("Roll No: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

 }
  class Main{  
    public static void main(String[] args)
    {
        student s = new student(43, "mani", 55);
        s.display();
    }
}

