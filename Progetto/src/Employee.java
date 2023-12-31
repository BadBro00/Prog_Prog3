package Progetto.src;
import java.util.Random;
import java.time.LocalDate;

public class Employee {
private 
    Random random = new Random();
    String nome,cognome,cf;
    int eta,ID;
    double stipendio;
public
    Employee(String n ,String cn ,String cf,int e ,double sal){
        this.nome=n;
        this.cognome=cn;
        this.cf=cf;
        this.ID = random.nextInt(100);
        this.eta=e;
        this.stipendio=sal;
    }
    public Employee() {}
    int getID(){return this.ID;}
    String getNome(){return this.nome;}
    String getCognome(){return this.cognome;}
    String getCf(){return this.cf;}
    int getEta(){return this.eta;}
    double getStipendio(){return this.stipendio;}
    public boolean validateBooking(Reservation reservation,String TableName) {
        boolean e;
        LocalDate d = reservation.getDate();
        LocalDate today = LocalDate.now();
        String resName = reservation.getClientName();
        if(d.isAfter(today) && resName.equals(TableName)){
            e = true;
        }else{
            e = false;
        }
        return e;
    }
    public void StampaDati(){
        System.out.println("\n\t|Employee Details:\n");
        System.out.println("--------------------");
        System.out.println("Name: " + this.getNome());
        System.out.println("Surname: " + this.getCognome());
        System.out.println("CF: " + this.getCf());
        System.out.println("ID: " + this.getID());
        System.out.println("Age: " + this.getEta());
        System.out.println("Salary: " + this.getStipendio());
        System.out.println("--------------------\n");
    }
}
