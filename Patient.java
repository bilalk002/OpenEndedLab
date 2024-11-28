public class Patient extends Thread {
	private BookingSystem bookingSystem;
    private String patientName;

    public Patient(BookingSystem bookingSystem, String patientName) {
        this.bookingSystem = bookingSystem;
        this.patientName = patientName;
    }

    @Override
    public void run() {
        bookingSystem.bookSlot(patientName);
    }
}

