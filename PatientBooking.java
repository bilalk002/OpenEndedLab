public class PatientBooking {
	 public static void main(String[] args) {
	        BookingSystem bookingSystem = new BookingSystem();

	        
	        Thread patient1 = new Patient(bookingSystem, "Patient 1");
	        Thread patient2 = new Patient(bookingSystem, "Patient 2");
	        Thread patient3 = new Patient(bookingSystem, "Patient 3");
	        Thread patient4 = new Patient(bookingSystem, "Patient 4");
	        Thread patient5 = new Patient(bookingSystem, "Patient 5");
	        Thread patient6 = new Patient(bookingSystem, "Patient 6"); 

	        
	        patient1.start();
	        patient2.start();
	        patient3.start();
	        patient4.start();
	        patient5.start();
	        patient6.start();
	    }
}
