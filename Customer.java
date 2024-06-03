public class Customer {
    private String CustName;//Hafizah Lim
    private String CustIC;//880527123456
    private String CustNumber;//0179876543
    private String CustEmail;//hafizah.lim@email.com
    private String CustStreet;//18 Persiaran Damansara
    private String CustCity;//Petaling Jaya
    private int CustZipCode;//46200
    private String CustState;//Selangor
    private int VehicleCode;//1,2,3
    private int count;
    
    //default constructor
    public Customer() {
         CustName = null;
         CustIC = null;
         CustNumber = null;
         CustEmail = null;
         CustStreet = null;
         CustCity = null;
         CustZipCode = 0;
         CustState = null;
         VehicleCode = 0;
    }
    //copy constructor
    public Customer(String cn, String IC, String cnb, String ce, String cs,String c,int zc,String s, int vc) {
        this.CustName = cn;
        this.CustIC = IC;
        this.CustNumber = cnb;
        this.CustEmail = ce;
        this.CustStreet = cs;
        this.CustCity = c;
        this.CustZipCode = zc;
        this.CustState = s;
        this.VehicleCode = vc;
    }
    //setter
    public void setCount(int count) {
        this.count = count;
    }
    //getter
    public String getCustName() {
        return CustName;
    }
    public String getCustIC() {
        return CustIC;
    }
    public String getCustNumber() {
        return CustNumber;
    }
    public String getCustEmail() {
        return CustEmail;
    }
    public String getCustStreet() {
        return CustStreet;
    }
    public String getCustCity() {
        return CustCity;
    }
    public int getCustZip() {
        return CustZipCode;
    }
    public String getCustState() {
        return CustState;
    }
    public int getVehicleCode() {
        return VehicleCode;
    }
    public int getCount() {
        return count;
    }
    //printer
    public String toString() {
        return ("Name : " + CustName + "\nIdentification Number : " + CustIC + "\nTelephone Number : " + CustNumber+ "\nEmail : " + CustEmail + "\nAddress Line 1 : " + CustStreet + "\nCity : " + CustCity +  "\nZip Code : " + CustZipCode + "\nState : " + CustState + "\nVehicle Code : " + VehicleCode);
    }
}
