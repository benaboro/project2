/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mybank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author itexps
 */
public class Mybank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        //empty employee list
        ArrayList<Employee> employees = new ArrayList<Employee>();
        //create a bank with empty employee list
        ArrayList<Customer> customer = new ArrayList<Customer>();
        Bank bank = new Bank(1, "IT Expert Bank", "847 350 9034", employees,customers);
        do {
            menu();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("== Add employee==");
                    System.out.println("Enter id");
                    int id = sc.nextInt();
                    System.out.println("Enter name");
                    String name = sc.next();

                    System.out.println("Enter email");
                    String email = sc.next();

                    System.out.println("Employee type");
                    String type = sc.next();
                    Customer cust1= null;
                    Account acct1= null;
                    
                    System.out.println("Enter Account id");
                    int accountid=sc.nextInt();
                    System.out.println(" Account Type");
                    int accounttype=sc.nextInt();
                     System.out.println(" Account balance");
                    float balance=sc.nextInt();
                    
                    

                    //add employee in a bank
                    bank.getEmployees().add(cust1);
                    System.out.println(bank);
                    break;
                case 2:
                    System.out.println("== Search employee == ");
                    System.out.println("Enter employee id ");
                    int eid = sc.nextInt();
                    boolean found = false;
                    for (Employee e : bank.getEmployees()) {
                        if (e.getId() == eid) {
                            System.out.println(e);
                            found = true;
                            break;
                        }
                    }
                    if (found == false) {
                        System.out.println("For this id - Employee does not exit");
                    }
                    break;
                case 3:
                    System.out.println("Save Employee and Customer");
                    try {
                        FileWriter fw = new FileWriter("c:\\data\\bank.txt");
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write ("===========Bank ============\n");
                        bw.write(bank.getId() + "|" + bank.getName() + "|" + bank.getPhone() + "\n");
                       
                        bw.write ("===========Employee[s] ============\n");

                        for (Employee e : bank.getEmployees()) {

                            bw.write(e.getId() + "|" + e.getName() + "|" + e.getEmail());
                            if (e instanceof FullTiimeEmployee) {
                                bw.write(((FullTiimeEmployee) e).getSalary() + "");
                            } else {
                                bw.write(((ContractorEmployee) e).getHourlyRate() + "");
                            }
                            bw.write("\n");
                           
                        } //for
                        for (Customer e : bank.getEmployees()) {

                            bw.write(c.getId() + "|" + c.getName() + "|" + c.getEmail());
                            bw.write ("|"+c.getCustType());                          
                            bw.write("\n");
                            
                            
                        }for (Account a: c.getAccount()) {

                            bw.write(c.getId() + "|" + a.getBlanace()+ "|" + a.getAccType());
                            bw.write ("|"+c.getCustType());                          
                            bw.write("\n");
                        if (e==null)continue;
                        
                      bw.close();
                      fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                     System.out.println("== Add customer==");
                    System.out.println("Enter id");
                    id = sc.nextInt();
                    System.out.println("Enter name");
                    name = sc.next();

                    System.out.println("Enter email");
                     email = sc.next();

                    System.out.println("Customer type");
                    type = sc.next();
                    Customer cust1 = null;
                    if (type.equalsIgnoreCase("individual")) {
                        //create employee instance with data
                      
                        cust1= new Customer(id,name,CutsomerType.Individual,null);
                    } else {
                        
                        cust1 = new Customer(id, name, e)mail,CustomerType.Business,null);
                    }

                    //add employee in a bank
                    bank.getEmployees().add(cust1);
                    System.out.println(bank);
                    break;
                    
                    
                    break;
            }
             System.out.println("== Search employee == ");
                    System.out.println("Enter employee id ");
                    int cid= sc.nextInt();
                     found =false;
                    for (Employee e : bank.getEmployees()) {
                        if (e.getId() == cid) {
                            System.out.println(e);
                            found = true;
                            break;

        } 

    }
                    if(found == false){
                        System.out.println("For this id- Customer does not exit")
                    }

    public static void menu() {
        System.out.println("customer ");
        System.out.println("Enter Customers id");
        
        System.out.println("4 for Quit");
        System.out.println("Enter your choice  ");
        
        
        
        System.out.println("4 for Add Customer");
        System.out.println("5 for Search Customer");
        System.out.println("6 for Save Customer");

        System.out.println("7 for Quit");
        System.out.println("Enter your choice  ");
        
        
    
    }
}
