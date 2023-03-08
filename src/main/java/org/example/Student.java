package org.example;

public abstract class Student {

    protected String getIdentityCardNumber;
    protected String adress;

    public Student() {
    }

    public abstract boolean wearsGlasses(boolean answer);

    public Student(String getIdentityCardNumber, String adress) {
        this.getIdentityCardNumber = getIdentityCardNumber;
        this.adress = adress;
    }

    public String getGetIdentityCardNumber() {
        return getIdentityCardNumber;
    }

    public void setGetIdentityCardNumber(String getIdentityCardNumber) {
        this.getIdentityCardNumber = getIdentityCardNumber;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;

        if (getGetIdentityCardNumber() != null ? !getGetIdentityCardNumber().equals(student.getGetIdentityCardNumber()) : student.getGetIdentityCardNumber() != null)
            return false;
        return getAdress() != null ? getAdress().equals(student.getAdress()) : student.getAdress() == null;
    }

    @Override
    public String toString() {
        return "Student{" +
                "getIdentityCardNumber='" + getIdentityCardNumber + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = getGetIdentityCardNumber() != null ? getGetIdentityCardNumber().hashCode() : 0;
        result = 31 * result + (getAdress() != null ? getAdress().hashCode() : 0);
        return result;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
