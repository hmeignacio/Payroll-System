/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.motorph.payrollsystem;

/**
 *
 * @author Hanna
 */ import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;

public class Payrollsystem {

    public static void main(String[] args) {
        String csvFile = "C:/Users/Hanna/Documents/NetBeansProjects/payrollsystem/src/main/java/com/motorph/payrollsystem/uploads/MotorPH Employee Data - Employee Details.csv";
String line;
String csvSplitter = ",";

try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
String header = br.readLine();
while ((line = br.readLine()) != null) {
String[] employeeData = line.split(csvSplitter);

String employeeNumber = employeeData[0];
String nameLast = employeeData[1];
String nameFirst = employeeData[2];
String birthday = employeeData[3];
String employeeAddress = employeeData[4];
String phoneNumber = employeeData[5];
String sss = employeeData[6];
String philhealth = employeeData[7];
String tin = employeeData[8];
String pagibig = employeeData[9];
String employeeStatus = employeeData[10];
String position = employeeData[11];
String supervisor = employeeData[12];
String basicSalary = employeeData[13];
String riceSubsidy = employeeData[14];
String phoneAllowance = employeeData[15];
String clothingAllowance = employeeData[16];
String grossSemiMonthlyRate = employeeData[17];
String hourlyRate = employeeData[18];

System.out.println("Start of employee details of Employee " + employeeNumber);
            System.out.println("Employee #:"+ employeeNumber +
            " \n Name: "+ nameFirst + nameLast +
            " \n Birthday: "+ birthday +
            " \n Address: "+ employeeAddress +
            " \n Phone: "+ phoneNumber +
            " \n SSS: "+ sss +
            " \n PhilHealth: "+ philhealth +
            " \n TIN: "+ tin +
            " \n Pag-ibig: "+ pagibig +
            " \n Status: "+ employeeStatus +
            " \n Position: "+ position +
            " \n Direct Supervisor: "+ supervisor +
            " \n Basic Salary: "+ basicSalary +
            " \n Rice Subsidy: "+ riceSubsidy +
            " \n Phone Allowance: "+ phoneAllowance +
            " \n Clothing Allowance: "+ clothingAllowance +
            " \n Gross Semi Monthly Rate: "+ grossSemiMonthlyRate +
            " \n Hourly Rate: "+ hourlyRate);
            System.out.println(" \n End of employee details of Employee" + employeeNumber);
            System.out.println("");
}
} catch (IOException e) {
e.printStackTrace();
}
    }
}
