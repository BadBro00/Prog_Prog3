package Progetto.src;
import java.util.Random;
import java.time.LocalDate;

public class EmployeeAccess {
private
    AccessState state;
    String nome,cognome,cf;
    Random random = new Random();
    double stipendio;
    int eta,ID;
public
    EmployeeAccess(String n ,String cn ,String cf,int e ,double sal){
        this.nome=n;
        this.cognome=cn;
        this.cf=cf;
        this.ID = random.nextInt(100);
        this.eta=e;
        this.stipendio=sal;
    }
    EmployeeAccess() {}
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
}
