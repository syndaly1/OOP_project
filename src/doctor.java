class Doctor {
    public Doctor() {}
    private int doctorId;
    private String name;
    private String specialty;
    private int yearsOfExperience;

    public Doctor(int doctorId, String name, String specialty, int yearsOfExperience) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public String getInfo() {
        return "Doctor ID: " + doctorId + ", Name: " + name + ", Specialty: " + specialty + ", Experience: " + yearsOfExperience + " years";
    }
    public boolean equals(Doctor other) {
        return this.doctorId == other.doctorId;
    }
}
