package Q6_com.myname.student;

public class Student{
    private String name;
    private int rollNo;
    private double CPI;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getCPI() {
        return CPI;
    }

    public void setCPI(double CPI) {
        this.CPI = CPI;
    }

    @Override
    public String toString(){
        return "Name: "+name+", RollNo: "+rollNo+", CPI: "+CPI;
    }
}
