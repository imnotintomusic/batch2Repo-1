package classes;

/**
 * Created by JPMPC-B217 on 11/10/2016.
 */
public class Employee extends Person{

    public String Department;
    public int employeeID;
    public int sssID;
    public int pagibigID;



    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSssID() {
        return sssID;
    }

    public void setSssID(int sssID) {
        this.sssID = sssID;
    }

    public int getPagibigID() {
        return pagibigID;
    }

    public void setPagibigID(int pagibigID) {
        this.pagibigID = pagibigID;
    }
}
