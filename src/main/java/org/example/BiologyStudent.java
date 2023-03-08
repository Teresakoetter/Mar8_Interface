package org.example;

public class BiologyStudent extends Student {

    public BiologyStudent() {
    }

    public void tellMeAboutYourSubject(){
        System.out.println("Molecules!");
    }

    @Override
    public String toString() {
        return "BiologyStudent{}";
    }

}
