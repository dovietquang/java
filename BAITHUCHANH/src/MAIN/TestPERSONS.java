package MAIN;

import PERSONS.EmployeeFulltime;
import PERSONS.EmployeePartTime;

public class TestPERSONS {
       public static void main(String[] args) {
        EmployeePartTime ep = new EmployeePartTime();
        ep.xuatvitri();
        ep.EnterData();
        ep.salary();
        ep.DisplayPosition();
        ep.Display();
        EmployeeFulltime ef = new EmployeeFulltime();
        ef.xuatvitri();
        ef.EnterData();
        ef.salary();
        ef.DisplayPosition();
        ef.Display();
    }
}

