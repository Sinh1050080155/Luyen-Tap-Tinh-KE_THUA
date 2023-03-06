package LuyentapCHAPTER4_KETHUA;

public class Vehicle {
    
	private String coLor;
	public String getCoLor() {
        return coLor;
    }
    public void setCoLor(String coLor) {
        this.coLor = coLor;
    }
    private String moDel;

	public String getMoDel() {
        return moDel;
    }
    public void setMoDel(String moDel) {
        this.moDel = moDel;
    }
    public Vehicle(String coLor, String moDel)
	{
		this.coLor = coLor;
		this.moDel = moDel;
	}

	public void run()
	{
		System.out.println("Bicycle: " + coLor);
		System.out.println("Car: " + moDel);
	}
}

