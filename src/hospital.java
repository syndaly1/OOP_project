class Hospital {
    public Hospital() {}
    private int hospitalId;
    private String name;
    private String location;

    public Hospital(int hospitalId, String name, String location) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.location = location;
    }
    public int getHospitalId() {
        return hospitalId;
    }
    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getInfo() {
        return "Hospital ID: " + hospitalId + ", Name: " + name + ", Location: " + location;
    }
    public boolean equals(Hospital other) {
        return this.hospitalId == other.hospitalId;
    }
}



