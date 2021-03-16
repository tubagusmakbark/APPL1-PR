package Week1.Polymorphic_Sorting;

public class Salesperson implements Comparable {
    private String firstName, lastName;
    private int totalSales;
    // ------------------------------------------------------
    // Constructor: Sets up the sales person object with
    // the given data.
    // ------------------------------------------------------
    public Salesperson(String first, String last, int sales) {
        firstName = first;
        lastName = last;
        totalSales = sales;
    }
    // -------------------------------------------
    // Returns the sales person as a string.
    // -------------------------------------------
    @Override
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    // -------------------------------------------
    // Returns true if the sales people have
    // the same name.
    // -------------------------------------------
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson) other).getLastName())
                && firstName.equals(((Salesperson) other).getFirstName()));
    }

    // --------------------------------------------------
    // Order is based on total sales with the name
    // (last, then first) breaking a tie.
    // --------------------------------------------------
    @Override
    public int compareTo(Object other) {
        int result;
        result=0;
        Salesperson otherSales = (Salesperson) other;
        if(this.totalSales > otherSales.totalSales)
            result = 1;
        if(this.totalSales < otherSales.totalSales)
            result = -1;
        if(this.totalSales == otherSales.totalSales) {
            if(this.firstName.compareTo(otherSales.firstName) == 0) {
                result = this.lastName.compareTo(otherSales.lastName);
            }
            else {
                result = this.firstName.compareTo(otherSales.lastName);
            }
        }
        return result;
    }
    // -------------------------
    // First name accessor.
    // -------------------------
    public String getFirstName() {
        return firstName;
    }
    // -------------------------
    // Last name accessor.
    // -------------------------
    public String getLastName() {
        return lastName;
    }
    // -------------------------
    // Total sales accessor.
    // -------------------------
    public int getSales() {
        return totalSales;
    }
}