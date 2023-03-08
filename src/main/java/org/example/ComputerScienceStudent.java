package org.example;

public class ComputerScienceStudent extends StudentAbstract implements Citizen{
    int nerdLevel;



    public ComputerScienceStudent() {
    }

    @Override
    public boolean wearsGlasses(boolean answer) {
        return answer;
    }

    public ComputerScienceStudent(String getIdentityCardNumber, String adress, int nerdLevel) {
        super(getIdentityCardNumber, adress);
        this.nerdLevel = nerdLevel;
    }

    public int getNerdLevel() {
        return nerdLevel;
    }

    public void setNerdLevel(int nerdLevel) {
        this.nerdLevel = nerdLevel;
    }


    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public int getIdentityCardNumber() {
        return 0;
    }

    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "nerdLevel=" + nerdLevel +
                ", getIdentityCardNumber='" + getIdentityCardNumber + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
