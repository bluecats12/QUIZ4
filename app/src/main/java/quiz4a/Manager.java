package quiz4a;
/**
 * สร้างคลาสผู้จัดการและสืบทอดคลาสพนักงาน
 */
// 2.1
public class Manager extends Employee {
    private String department;
    private double bonus;
 /**
     * พนักงาน เก็บ ไอดี, ชื่อพนักงาน, เงินเดือน, โบนัส
     * 
     * @param employeeId
     *                 ไอดีของพนักงงาน
     * @param name
     *                 ชื่อของพนักงาน
     * @param salary
     *                  เงินเดือนของพนักงาน
     * @param department
     *                  แผนก
     * @param bonut
     *                  โบนัส                 
     */
    
    // 2.2
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }
/**
 * สร้าง method รายละเอียด พนักงาน
 * 
 */
    // 2.3
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    //2.4
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }
}
