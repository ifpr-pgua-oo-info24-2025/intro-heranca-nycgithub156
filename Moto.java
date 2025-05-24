public class Moto extends Veiculo{
    private String handlebar;

    public Moto(String brand, String model, int year, String handlebar) {
        super(brand,model,year);
        this.handlebar = handlebar;
    }

    public String getHandlebar() {
        return handlebar;
    }

    public void setHandlebar(String handlebar) {
        this.handlebar = handlebar;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Handlebar: " + handlebar);
    }
}
