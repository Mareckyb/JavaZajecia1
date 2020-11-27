package com.company;
import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car auto;




    public Car getAuto() {
        return auto;
    }



    public void setAuto(Car auto) {

        if (auto.price/12>this.salary) {
            System.out.println("Idź po podwyżkę");

        } else {
            if (auto.price<this.salary )
            System.out.println("You Bought it :-)");
            else System.out.println("Kupiłęś na kredyt");

            this.auto = auto;}


    }

    private Double salary;





    public Double getSalary() {
        System.out.println(LocalDateTime.now());
        System.out.println(this.salary);
        return this.salary;
    }

    public void setSalary(Double money){
        if (money>0) {
            System.out.println("Dane zostały wysłane do systemu księgowego.");
            System.out.println("Proszę odebrać aneks z Kadr od pani Hani.");
            System.out.println("ZUS i US już wszystko wiedzą. Nie ukrywaj dochodu :-) ");
            this.salary = money;
            }
        }


}
