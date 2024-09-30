class Company {
     String name;
     String address;
     double cost;
     double income;
     double benefit;


    // Constructor
    public Company(String name, String address, double cost, double income) {
        this.name = name;
        this.address = address;
        this.cost = cost;
        this.income = income;
        this.benefit = calculateBenefit();
    }

    private double calculateBenefit() {
        return income - cost;
    }

    public void displayCompanyInfo() {
        System.out.println("Company Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Total Cost: " + cost);
        System.out.println("Total Income: " + income);
        System.out.println("Total Benefit : " + benefit);
    }
}

class Company6{
    public static void main(String[] args) {
        Company company1 = new Company("An", "Tang 4 Muong Thanh", 150000, 250000);
        company1.displayCompanyInfo();

        Company company2 = new Company("Kha Banh", "Trong Tu", 500000, 700000);
        company2.displayCompanyInfo();

    }
}