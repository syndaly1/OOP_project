public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(89, "Inkgar", 17, "Flu");
        Patient patient2 = new Patient(2, "Symbat", 18, "Cold");

        Doctor doctor1 = new Doctor(101, "Dr. Azamatovna", "Therapist", 3);
        Doctor doctor2 = new Doctor(5, "Dr. Crush", "Surgeon", 8);

        Hospital hospital1 = new Hospital(67, "City Hospital", "Almaty");
        Hospital hospital2 = new Hospital(31, "Central Hospital", "Astana");

        System.out.println(patient1.getInfo());
        System.out.println(patient2.getInfo());
        System.out.println(doctor1.getInfo());
        System.out.println(doctor2.getInfo());
        System.out.println(hospital1.getInfo());
        System.out.println(hospital2.getInfo());

        // Compare multiple objects
        System.out.println("\nComparing patients by ID: " + patient1.getPatientId() + " and " + patient2.getPatientId());
        System.out.println("Are the patients the same? " + patient1.equals(patient2));

        System.out.println("\nComparing doctors by ID: " + doctor1.getDoctorId() + " and " + doctor2.getDoctorId());
        System.out.println("Are the doctors the same? " + doctor1.equals(doctor2));

        System.out.println("\nComparing hospitals by ID: " + hospital1.getHospitalId() + " and " + hospital2.getHospitalId());
        System.out.println("Are the hospitals the same? " + hospital1.equals(hospital2));
    }
}
