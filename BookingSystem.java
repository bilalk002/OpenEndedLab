public class BookingSystem {
	 private int availableSlots = 5; 

	    
	    public synchronized void bookSlot(String patientName) {
	        if (availableSlots > 0) {
	            System.out.println(patientName + " successfully booked a slot.");
	            availableSlots--;
	            System.out.println("Slots remaining: " + availableSlots);
	            
	        } else {
	            System.out.println(patientName + " failed to book a slot. No slots available.");
	            
	        }
	    }
	}

