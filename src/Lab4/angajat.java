package Lab4;

public class angajat {
    private String name;
    private String email;
    private int hourRate;
    private int capacity;
    private int freeDays;

    public int calculateDailyIncome(){
        return hourRate*capacity;
    }

    public int calculateMonthlyIncome(){
        return calculateDailyIncome()*30-freeDays*hourRate*capacity;
    }

    public void setName(String newName){name = newName;}
    public String getName(){return name;}

    public void setEmail(String newEmail){email = newEmail;}
    public String getEmail(){return email;}

    public void setHourRate(int newHourRate){hourRate = newHourRate;}
    public int getHourRate(){return hourRate;}

    public void setCapacity(int newCapacity){capacity = newCapacity;}
    public int getCapacity(){return capacity;}

    public void setFreeDays(int newFreeDays){freeDays = newFreeDays;}
    public int getFreeDays(){return freeDays;}
}