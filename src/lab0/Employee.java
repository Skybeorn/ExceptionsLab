package lab0;

import java.util.Date;

public class Employee {

    public static final int MAX_VACATION_DAYS = 28;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        setHireDate(hireDate);
        setDaysVacation(daysVacation);
    }

    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        if (daysVacation < 0 || daysVacation > MAX_VACATION_DAYS) {
            throw new IllegalArgumentException("Out of Required Range.");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() < 2) {
            throw new IllegalArgumentException("First Name does not Meet Standard.");
        }
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        Date today = new Date();
        if (hireDate == null || hireDate.after(today)) {
            throw new IllegalArgumentException("Impossibile.");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() < 2) {
            throw new IllegalArgumentException("Last Name does not Meet Standard.");
        }
    }

    public final String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        if (ssn == null || ssn.length() < 9) {
            throw new IllegalArgumentException("Ssn should only be Numbers "  
                    + " No Dashes or Spaces");
        }
    }
}
